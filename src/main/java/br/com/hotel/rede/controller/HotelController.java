package br.com.hotel.rede.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hotel.rede.dto.HotelDto;
import br.com.hotel.rede.model.Hotel;
import br.com.hotel.rede.repository.HotelRepository;
import br.com.hotel.rede.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	HotelService hotelService;

	@GetMapping
	public List<HotelDto> buscar() {
		System.out.println("buscando hoteis");
		List<Hotel> hoteis = hotelService.buscar();
		List<HotelDto> converte = HotelDto.converte(hoteis);
		return converte;
	}

	@GetMapping("/{id}")
	public HotelDto buscarPorId(@PathVariable Long id) {
		System.out.println("buscando hotel por id" + id);
		
		Hotel hotel = hotelService.buscarPorId(id);
		HotelDto converte = HotelDto.converte(hotel);
		
		return converte;
	}

	@PostMapping
	public void gravar(@RequestBody HotelDto hotelDto) {
		System.out.println(hotelDto);
		hotelService.gravar(HotelDto.converte(hotelDto));
	}

	@PutMapping("/{id}")
	public void atualiza (@PathVariable Long id, @RequestBody Hotel hotel) {
		System.out.println("atualizando hotel por id" + id + hotel);
		hotelService.atualiza(id, hotel);
		}

	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		System.out.println("removendo hotel" + id);
		hotelService.remove(id);
	}

}

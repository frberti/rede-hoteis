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

import br.com.hotel.rede.model.Hotel;
import br.com.hotel.rede.repository.HotelRepository;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	HotelRepository hotelRepository;

	@GetMapping
	public List<Hotel> buscar() {
		System.out.println("buscando hoteis");
		return hotelRepository.findAll();
	}

	@GetMapping("/{id}")
	public Hotel buscarPorId(@PathVariable Long id) {
		System.out.println("buscando hotel por id" + id);
		return hotelRepository.findById(id).get();
	}

	@PostMapping
	public void gravar(@RequestBody Hotel hotel) {
		System.out.println(hotel);
		hotelRepository.save(hotel);
	}
	
	@PutMapping("/{id}")
	public void atualiza (@PathVariable Long id, @RequestBody Hotel hotel) {
		System.out.println("atualizando hotel por id" + id + hotel);
	}
	
	@DeleteMapping("/{id}")
	public void remove (@PathVariable Long id) {
		System.out.println("removendo hotel" + id);
	}
	

}

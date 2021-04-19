package br.com.hotel.rede.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

import br.com.hotel.rede.dto.ReservaDto;
import br.com.hotel.rede.model.BaseModel;
import br.com.hotel.rede.model.Reserva;
import br.com.hotel.rede.repository.ReservaRepository;
import br.com.hotel.rede.service.ReservaService;

@RestController
@RequestMapping("/reserva")
public class ReservaController extends BaseModel {

	@Autowired
	ReservaService reservaService;

	@GetMapping
	List<ReservaDto> reserva() {
		System.out.println("buscando lista de reservas: ");

		return ReservaDto.converte(reservaService.reserva());
	}

	@GetMapping("/{id}")
	public ReservaDto buscarPorId(@PathVariable Long id) {
		System.out.println("buscando reserva por id: " + id);
//		Reserva reserva = reservaService.buscarPorId(id);
//		ReservaDto reservaDto = ReservaDto.converte(reserva);
//		return reservaDto;

		return ReservaDto.converte(reservaService.buscarPorId(id));
	}

	@PostMapping
	public void gravar(@RequestBody ReservaDto reservaDto) {
		System.out.println("gravando uma reserva: " + reservaDto);

		Reserva reserva = ReservaDto.converte(reservaDto);
		reservaService.gravar(reserva);

	}

	@PutMapping("/{id}")
	public void atualizar(@PathVariable Long id, @RequestBody ReservaDto reservaDto) {
		System.out.println("atualizando uma reserva: " + reservaDto + " : " + id);
		reservaService.atualizar(id, ReservaDto.converte(reservaDto));
	}

	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		System.out.println("removendo uma reserva: " + id);
		reservaService.remove(id);

	}

}

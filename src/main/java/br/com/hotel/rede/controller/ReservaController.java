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

import br.com.hotel.rede.model.BaseModel;
import br.com.hotel.rede.model.Reserva;
import br.com.hotel.rede.repository.ReservaRepository;

@RestController
@RequestMapping("/reserva")
public class ReservaController extends BaseModel {
	
	@Autowired
	ReservaRepository reservaRepository;
	
	@GetMapping
	List<Reserva> reserva() {
		System.out.println("buscando lista de reservas: ");
		return reservaRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Reserva buscarPorId(@PathVariable Long id) {
		System.out.println("buscando reserva por id: " + id);
		return reservaRepository.findById(id).get();
	}
	
	@PostMapping
	public void gravar(@RequestBody Reserva reserva) {
		System.out.println("gravando uma reserva: " + reserva);
		reservaRepository.save(reserva);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@PathVariable Long id, @RequestBody Reserva reserva) {
		System.out.println("atualizando uma reserva: " + reserva + " : " + id);
	}
	
	@DeleteMapping("/{id}")
	public void remove (@PathVariable Long id){
		System.out.println("removendo uma reserva: " + id);
		reservaRepository.deleteById(id);
	}
	
	

}

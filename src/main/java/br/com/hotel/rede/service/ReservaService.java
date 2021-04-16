package br.com.hotel.rede.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.hotel.rede.model.Reserva;
import br.com.hotel.rede.repository.ReservaRepository;

@Service
public class ReservaService {
	
	@Autowired
	ReservaRepository reservaRepository;
	
	public List<Reserva> reserva() {
		System.out.println("buscando lista de reservas: ");
		return reservaRepository.findAll();
	}
	
	public Reserva buscarPorId(@PathVariable Long id) {
		System.out.println("buscando reserva por id: " + id);
		return reservaRepository.findById(id).get();
	}
	
	public void gravar(@RequestBody Reserva reserva) {
		System.out.println("gravando uma reserva: " + reserva);
		reservaRepository.save(reserva);
	}
	
	public void atualizar(@PathVariable Long id, @RequestBody Reserva reserva) {
		System.out.println("atualizando uma reserva: " + reserva + " : " + id);
	}
	
	public void remove (@PathVariable Long id){
		System.out.println("removendo uma reserva: " + id);
		reservaRepository.deleteById(id);
	}

}

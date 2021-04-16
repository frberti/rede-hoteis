package br.com.hotel.rede.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hotel.rede.model.Hotel;
import br.com.hotel.rede.repository.HotelRepository;

@Service
public class HotelService {
	
	@Autowired
	HotelRepository hotelRepository;
	
	
	public List<Hotel> buscar() {
		System.out.println("buscando hoteis");
		return hotelRepository.findAll();
	}

	
	public Hotel buscarPorId(Long id) {
		System.out.println("buscando hotel por id" + id);
		return hotelRepository.findById(id).get();
	}

	public void gravar(Hotel hotel) {
		System.out.println(hotel);
		hotelRepository.save(hotel);
	}
	
	public void atualiza (Long id, Hotel hotel) {
		System.out.println("atualizando hotel por id" + id + hotel);
	}
	
	public void remove (Long id) {
		System.out.println("removendo hotel" + id);
		hotelRepository.deleteById(id);
	}

}

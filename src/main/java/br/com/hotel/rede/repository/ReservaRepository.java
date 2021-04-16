package br.com.hotel.rede.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.hotel.rede.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long>{
	
	

}

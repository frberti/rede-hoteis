package br.com.hotel.rede.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.hotel.rede.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
	@Query("SELECT distinct h FROM Hotel h "
		 + "join fetch h.quartos "
		 + "join fetch h.endereco ")
	List<Hotel> buscarHoteisComQuartos();

}

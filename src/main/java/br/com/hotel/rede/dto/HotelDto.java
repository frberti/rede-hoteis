package br.com.hotel.rede.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.hotel.rede.model.Endereco;
import br.com.hotel.rede.model.Hotel;

public class HotelDto extends BaseDto {
	
	private String nome;
	private EnderecoDto enderecoDto;	
	HotelCompletoDto hotelCompletoDto;
	
	public HotelDto(String nome, Endereco endereco, Long id) {
		
		this.nome = nome;
		this.enderecoDto = EnderecoDto.converte(endereco);
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	
	public EnderecoDto getEnderecoDto() {
		return enderecoDto;
	}
	
	public static List<? extends HotelDto> converte(List<Hotel> hoteis) {
		
		List<HotelDto> hoteisDto = new ArrayList<HotelDto>();
		
		for (int i = 0; i < hoteis.size(); i++) {
			
			HotelDto hotelDto = converte(hoteis.get(i));
			
			hoteisDto.add(hotelDto);
			
		}
		
		
		return hoteisDto;
	}
	
	public static HotelDto converte (Hotel hotel) {
		
		HotelDto hotelDto = new HotelDto(hotel.getNome(), hotel.getEndereco(), hotel.getId());
		
		return hotelDto;
		
	}
	
	public static Hotel converte(HotelDto hotelDto) {
		Hotel hotel = new Hotel(hotelDto);
		
		return hotel;
	}

}

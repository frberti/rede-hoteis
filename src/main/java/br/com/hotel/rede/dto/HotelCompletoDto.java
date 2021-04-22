package br.com.hotel.rede.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.hotel.rede.model.Endereco;
import br.com.hotel.rede.model.Hotel;

public class HotelCompletoDto extends HotelDto {
	
	private List<QuartoDto> quartosDto;

	public List<QuartoDto> getQuartosDto() {
		return quartosDto;
	}


	public HotelCompletoDto(String nome, Endereco endereco, Long id, List<QuartoDto> quartosDto) {
		super(nome, endereco, id);
		this.quartosDto = quartosDto;
	}
	
	public static List<HotelCompletoDto> converte(List<Hotel> hoteis) {
		
		
		List<HotelCompletoDto> hoteisCompletosDto = new ArrayList<>();
				
		for(Hotel h : hoteis) {
			List<QuartoDto> quartosDto = QuartoDto.converte(new ArrayList<>(h.getQuartos()));
			
			HotelCompletoDto hotelCompletoDto = new HotelCompletoDto(h.getNome(), h.getEndereco(), h.getId(), quartosDto);
			
			hoteisCompletosDto.add(hotelCompletoDto);
		}
		
		
		return hoteisCompletosDto;
	}
	
	
	
	

}

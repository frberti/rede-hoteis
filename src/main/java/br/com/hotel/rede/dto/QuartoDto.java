package br.com.hotel.rede.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.hotel.rede.model.Quarto;
import br.com.hotel.rede.model.TipoQuartoEnum;

public class QuartoDto extends BaseDto {

	private String numero;
	private TipoQuartoEnum tipo;
	private float valor;
	private Long hotelId;

	public QuartoDto() {
	}

	public QuartoDto(Quarto q) {

		this.numero = q.getNumero();
		this.tipo = q.getTipo();
		this.valor = q.getValor();
		this.hotelId = q.getHotel().getId();
		this.id = q.getId();

	}

	public String getNumero() {
		return numero;
	}

	public TipoQuartoEnum getTipo() {
		return tipo;
	}

	public float getValor() {
		return valor;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public static List<QuartoDto> converte(List<Quarto> quartos) {

		List<QuartoDto> quartosDto = new ArrayList<QuartoDto>();

		for (Quarto q : quartos) {

			quartosDto.add(converte(q));

		}

		return quartosDto;

	}

	public static QuartoDto converte(Quarto quarto) {

		return new QuartoDto(quarto);

	}

	public static Quarto converte(QuartoDto quartoDto) {
		return new Quarto(quartoDto);
	}

}

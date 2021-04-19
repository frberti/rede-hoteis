package br.com.hotel.rede.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.hotel.rede.model.Reserva;

public class ReservaDto extends BaseDto {

	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	private Long quartoId;

	public ReservaDto(Reserva r) {

		this.dataInicio = r.getDataInicio();
		this.dataFim = r.getDataFim();
		this.id = r.getId();
		this.quartoId = r.getQuarto().getId();
				

	}
	
	public ReservaDto() {
		
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}
	
	public Long getQuartoId() {
		return quartoId;
	}

	public static ReservaDto converte(Reserva reserva) {
		return new ReservaDto(reserva);
	}

	public static List<ReservaDto> converte(List<Reserva> reservas) {

		List<ReservaDto> reservasDto = new ArrayList<ReservaDto>();

		for (Reserva r : reservas) {

			reservasDto.add(converte(r));
		}

		return reservasDto;

	}

	public static Reserva converte(ReservaDto reservaDto) {
		Reserva reserva = new Reserva(reservaDto);

		return reserva;

	}

}

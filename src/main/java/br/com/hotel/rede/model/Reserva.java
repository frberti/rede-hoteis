package br.com.hotel.rede.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import br.com.hotel.rede.dto.ReservaDto;

@Entity
public class Reserva extends BaseModel {

	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	@ManyToOne
	private Quarto quarto;
	
	public Reserva (ReservaDto reservaDto) {
		this.dataInicio = reservaDto.getDataInicio();
		this.dataFim = reservaDto.getDataFim();
		
		Quarto quarto = new Quarto();
		quarto.setId(reservaDto.getQuartoId());
		this.quarto = quarto;
		
	}
	
	public Reserva() {
		
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public Quarto getQuarto() {
		return quarto;
	}

	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	@Override
	public String toString() {
		return "Reserva [dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", quarto=" + quarto + "]";
	}

}

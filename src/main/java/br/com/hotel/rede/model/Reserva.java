package br.com.hotel.rede.model;

import java.time.LocalDateTime;

public class Reserva extends BaseModel {

	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

}
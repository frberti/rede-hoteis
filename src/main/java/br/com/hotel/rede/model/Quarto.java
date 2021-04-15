package br.com.hotel.rede.model;

import java.util.List;

public class Quarto extends BaseModel {

	private String numero;
	private TipoQuartoEnum tipo;
	private float valor;
	private Hotel hotel;
	private List<Reserva> reserva;

	public List<Reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getValor() {
		return valor;
	}

	public TipoQuartoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoQuartoEnum tipo) {
		this.tipo = tipo;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Quarto [numero=" + numero + ", tipo=" + tipo + ", valor=" + valor + ", hotel=" + hotel + ", reserva="
				+ reserva + "]";
	}
	
	

}

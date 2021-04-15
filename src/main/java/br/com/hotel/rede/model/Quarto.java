package br.com.hotel.rede.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Quarto extends BaseModel {

	private String numero;
	private TipoQuartoEnum tipo;
	private float valor;
	@ManyToOne
	private Hotel hotel;
	@OneToMany(mappedBy = "quarto")
	private List<Reserva> reservas;

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
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
				+ reservas + "]";
	}

}

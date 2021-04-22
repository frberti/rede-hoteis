package br.com.hotel.rede.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import br.com.hotel.rede.dto.EnderecoDto;
import br.com.hotel.rede.dto.HotelDto;

@Entity
public class Hotel extends BaseModel {

	private String nome;
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
	private Set<Quarto> quartos;

	public Hotel(HotelDto hotelDto) {
		this.nome = hotelDto.getNome();
		this.endereco = EnderecoDto.converte(hotelDto.getEnderecoDto());

	}
	
	public Hotel() {
		
	}

	public Set<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(Set<Quarto> quartos) {
		this.quartos = quartos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Hotel [nome=" + nome + ", endereco=" + endereco + ", quartos=" + quartos + "]";
	}

}

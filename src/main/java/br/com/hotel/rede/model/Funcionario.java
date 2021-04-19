package br.com.hotel.rede.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Funcionario extends BaseModel {

	private String nome;
	private String telefone;
	private CargoEnum cargo;
	@OneToOne (cascade = CascadeType.ALL)
	private Endereco endereco;
	@ManyToOne
	private Hotel hotel;
	
	
	
	public Funcionario() {
		
	}
	
	public Funcionario(FuncionarioDto funcionarioDto) {
		this.nome = funcionarioDto.getNome();
		this.telefone = funcionarioDto.getTelefone();
		this.cargo = funcionarioDto.getCargo();
		this.endereco = funcionarioDto.getEndereco();
		Hotel hotel = new Hotel();
		hotel.setId(funcionarioDto.getHotelId());
		this.hotel = hotel;
	}

	public CargoEnum getCargo() {
		return cargo;
	}

	public void setCargo(CargoEnum cargo) {
		this.cargo = cargo;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", telefone=" + telefone + ", cargo=" + cargo + ", endereco=" + endereco
				+ ", hotel=" + hotel + "]";
	}	
	

}

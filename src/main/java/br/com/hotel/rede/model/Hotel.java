package br.com.hotel.rede.model;

import java.util.List;

public class Hotel extends BaseModel {

	private String nome;
	private Endereco endereco;
	private List<Quarto> quartos;
	

	public List<Quarto> getQuartos() {
		return quartos;
	}

	public void setQuartos(List<Quarto> quartos) {
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

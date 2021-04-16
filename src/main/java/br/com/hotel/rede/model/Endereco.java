package br.com.hotel.rede.model;

import javax.persistence.Entity;

import br.com.hotel.rede.dto.EnderecoDto;

@Entity
public class Endereco extends BaseModel {

	private String rua;
	private String numero;
	private String bairro;
	private String cidade;

	public Endereco(EnderecoDto enderecoDto) {
		this.rua = enderecoDto.getRua();
		this.numero = enderecoDto.getNumero();
		this.bairro = enderecoDto.getBairro();
		this.cidade = enderecoDto.getBairro();
	}
	
	public Endereco() {
		
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + "]";
	}

}

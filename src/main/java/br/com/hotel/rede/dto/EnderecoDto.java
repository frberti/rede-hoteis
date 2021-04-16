package br.com.hotel.rede.dto;

import br.com.hotel.rede.model.Endereco;

public class EnderecoDto extends BaseDto {

	private String rua;
	private String numero;
	private String bairro;
	private String cidade;

	public EnderecoDto(Endereco endereco) {
		this.rua = endereco.getRua();
		this.numero = endereco.getNumero();
		this.bairro = endereco.getBairro();
		this.cidade = endereco.getCidade();
		this.id = endereco.getId();

	}

	public String getRua() {
		return rua;
	}

	public String getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public static EnderecoDto converte(Endereco endereco) {

		EnderecoDto enderecoDto = new EnderecoDto(endereco);

		return enderecoDto;
	}

	public static Endereco converte(EnderecoDto enderecoDto) {
		Endereco endereco = new Endereco(enderecoDto);

		return endereco;
	}

}

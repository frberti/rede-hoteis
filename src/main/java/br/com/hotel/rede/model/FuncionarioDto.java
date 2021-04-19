package br.com.hotel.rede.model;

import java.util.ArrayList;
import java.util.List;

import br.com.hotel.rede.dto.BaseDto;

public class FuncionarioDto extends BaseDto {

	private String nome;
	private String telefone;
	private CargoEnum cargo;
	private Endereco endereco;
	private Long hotelId;

	public FuncionarioDto() {

	}

	public FuncionarioDto(Funcionario f) {
		this.nome = f.getNome();
		this.telefone = f.getTelefone();
		this.cargo = f.getCargo();
		this.endereco = f.getEndereco();
		this.hotelId = f.getHotel().getId();
		this.id = f.getId();

	}

	public Long getHotelId() {
		return hotelId;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public CargoEnum getCargo() {
		return cargo;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public static List<FuncionarioDto> converte(List<Funcionario> funcionarios) {
		
		List<FuncionarioDto> funcionariosDto = new ArrayList<FuncionarioDto>();
		
		for(Funcionario f : funcionarios) {
			
			funcionariosDto.add(converte(f));
		
		}
		return funcionariosDto;
		
	}
	
	public static FuncionarioDto converte(Funcionario funcionario) {
		return new FuncionarioDto(funcionario);
	}
	
	public static Funcionario converte(FuncionarioDto funcionarioDto) {
		return new Funcionario(funcionarioDto); 
	}
	

}

package br.com.hotel.rede.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hotel.rede.model.Funcionario;
import br.com.hotel.rede.model.FuncionarioDto;
import br.com.hotel.rede.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

	@Autowired
	FuncionarioService funcionarioService;

	@GetMapping
	public List<FuncionarioDto> buscar() {
		List<Funcionario> funcionarios = funcionarioService.buscar();
		return FuncionarioDto.converte(funcionarios);
	}

	@GetMapping("/{id}")
	public FuncionarioDto buscarPorId(@PathVariable Long id) {
		return FuncionarioDto.converte(funcionarioService.buscarPorId(id));

	}

	@PostMapping
	public void gravar(@RequestBody FuncionarioDto funcionarioDto) {
		funcionarioService.gravar(FuncionarioDto.converte(funcionarioDto));
	}

	@PutMapping("/{id}")
	public void atualiza(@RequestBody Funcionario funcionario, @PathVariable Long id) {
		funcionarioService.atualiza(funcionario, id);
	}

	@DeleteMapping
	public void remove(@PathVariable Long id) {
		funcionarioService.remove(id);
	}

}

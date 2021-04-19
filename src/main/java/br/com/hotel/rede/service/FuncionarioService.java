package br.com.hotel.rede.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.hotel.rede.model.Funcionario;
import br.com.hotel.rede.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	
	public List<Funcionario> buscar() {
		return funcionarioRepository.findAll();
	}
	
	public Funcionario buscarPorId(Long id) {
		return funcionarioRepository.findById(id).get();
	}
	
	public void gravar(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}
	
	public void atualiza(Funcionario funcionario, @PathVariable Long id) {
		
	}
	
	public void remove(Long id) {
		funcionarioRepository.deleteById(id);
	}
	
}

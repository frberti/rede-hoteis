package br.com.hotel.rede.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.hotel.rede.model.Quarto;
import br.com.hotel.rede.repository.QuartoRepository;

@Service
public class QuartoService {
	
	@Autowired
	QuartoRepository quartoRepository;
	
	
	public List<Quarto> buscar() {
		System.out.println("buscando quarto");
		return quartoRepository.findAll();
	}
	
	public Quarto buscarPorId(Long id) {
		System.out.println("buscando quarto por id: " + id);
		return quartoRepository.findById(id).get();
	}
	
	public void gravar(Quarto quarto) {
		System.out.println("gravando quarto: " + quarto);
		quartoRepository.save(quarto);
	}
	
	public void atualiza(Quarto quarto, @PathVariable Long id) {
		System.out.println("atualizando quarto: " + id);
	}
	
	public void remove(Long id) {
		System.out.println("removendo quarto: " + id);
		quartoRepository.deleteById(id);
	}

}

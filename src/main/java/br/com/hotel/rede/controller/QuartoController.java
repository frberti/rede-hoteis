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

import br.com.hotel.rede.model.Quarto;
import br.com.hotel.rede.repository.QuartoRepository;

@RestController
@RequestMapping("/quarto")
public class QuartoController {
	
	@Autowired
	QuartoRepository quartoRepository;
	
	@GetMapping
	public List<Quarto> buscar() {
		System.out.println("buscando quarto");
		return quartoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Quarto buscarPorId(@PathVariable Long id) {
		System.out.println("buscando quarto por id: " + id);
		return quartoRepository.findById(id).get();
	}
	
	@PostMapping
	public void gravar(@RequestBody Quarto quarto) {
		System.out.println("gravando quarto: " + quarto);
		quartoRepository.save(quarto);
	}
	
	@PutMapping("/{id}")
	public void atualiza(@RequestBody Quarto quarto, @PathVariable Long id) {
		System.out.println("atualizando quarto: " + id);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		System.out.println("removendo quarto: " + id);
		quartoRepository.deleteById(id);
	}

}

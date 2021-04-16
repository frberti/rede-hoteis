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

import br.com.hotel.rede.dto.QuartoDto;
import br.com.hotel.rede.model.Quarto;
import br.com.hotel.rede.repository.QuartoRepository;
import br.com.hotel.rede.service.QuartoService;

@RestController
@RequestMapping("/quarto")
public class QuartoController {

	@Autowired
	QuartoService quartoService;

	@GetMapping
	public List<QuartoDto> buscar() {
		System.out.println("buscando quarto");
		List<Quarto> quartos = quartoService.buscar();
		return QuartoDto.converte(quartos);
	}

	@GetMapping("/{id}")
	public QuartoDto buscarPorId(@PathVariable Long id) {
		System.out.println("buscando quarto por id: " + id);
		return QuartoDto.converte(quartoService.buscarPorId(id));
	}

	@PostMapping
	public void gravar(@RequestBody QuartoDto quartoDto) {
		System.out.println("gravando quarto: " + quartoDto);

		quartoService.gravar(QuartoDto.converte(quartoDto));
	}

	@PutMapping("/{id}")
	public void atualiza(@RequestBody Quarto quarto, @PathVariable Long id) {
		System.out.println("atualizando quarto: " + id);
		quartoService.atualiza(quarto, id);
	}

	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		System.out.println("removendo quarto: " + id);
		quartoService.remove(id);
	}

}

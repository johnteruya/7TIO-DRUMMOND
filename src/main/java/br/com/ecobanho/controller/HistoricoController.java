package br.com.ecobanho.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecobanho.model.Historico;
import br.com.ecobanho.repository.HistoricoRepository;

@RestController
@RequestMapping("/api")
public class HistoricoController {

	@Autowired
	HistoricoRepository historicoRepository;

	@GetMapping("/historicos")
	public List<Historico> getAllView() {
		return historicoRepository.findAll();
	}
	
	@GetMapping("/historicoPorData")
	public List<Historico> getHistoricoByDate(Long idUsuario, String dataInicial, String dataFinal){
		return historicoRepository.getHistoricoByDate(idUsuario, dataInicial, dataFinal);
	}
}
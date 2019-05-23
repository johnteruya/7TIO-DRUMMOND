package br.com.ecobanho.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecobanho.model.View;
import br.com.ecobanho.repository.ViewRepository;

@RestController
@RequestMapping("/api")
public class ViewController {

	@Autowired
	ViewRepository viewRepository;

	@GetMapping("/view")
	public List<View> getAllView() {
		return viewRepository.findAll();
	}
	
	@GetMapping("/historico")
	public List<View> getViewByDate(Long idUsuario, String dataInicial, String dataFinal){
		return viewRepository.getViewByDate(idUsuario, dataInicial, dataFinal);
	}
}
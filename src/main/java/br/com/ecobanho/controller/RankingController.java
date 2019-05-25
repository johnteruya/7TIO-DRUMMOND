package br.com.ecobanho.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecobanho.model.Ranking;
import br.com.ecobanho.repository.RankingRepository;

@RestController
@RequestMapping("/ranking")
public class RankingController {

	@Autowired
	RankingRepository rankingRepository;

	
	@GetMapping("/listarPorGrupo")
	public List<Ranking> getRankingByGroup(Long id_grupo){
		return rankingRepository.getRankingByGroup(id_grupo);
	}
}
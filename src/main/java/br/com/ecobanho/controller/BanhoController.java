package br.com.ecobanho.controller;

import br.com.ecobanho.exception.ResourceNotFoundException;
import br.com.ecobanho.model.Banho;
import br.com.ecobanho.repository.BanhoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BanhoController {

	@Autowired
	BanhoRepository banhoRepository;

	@GetMapping("/banhos")
	public List<Banho> getAllBanhos() {
		return banhoRepository.findAll();
	}

	@PostMapping("/banhos")
	public Banho createBanho(@Valid @RequestBody Banho banho) {
		return banhoRepository.save(banho);
	}

	@GetMapping("/banhos/{id_banho}")
	public Banho getBanhoById_banho(@PathVariable(value = "id_banho") Long banhoId) {
		return banhoRepository.findById(banhoId)
				.orElseThrow(() -> new ResourceNotFoundException("Banho", "id_banho", banhoId));
	}
	
	@DeleteMapping("/banhos/{id_banho}") public ResponseEntity<?>deleteBanho(@PathVariable(value = "id_banho") Long banhoId) {
		Banho banho = banhoRepository.findById(banhoId)
				.orElseThrow(() -> new ResourceNotFoundException("banho", "id_banho", banhoId));
		banhoRepository.delete(banho);
		
		return ResponseEntity.ok().build();
	
	}

	@PostMapping("/banhos/{id_banho}") public Banho updateBanho(@PathVariable(value = "id_banho")Long banhoId,
			@Valid @RequestBody Banho banhoDetails) {
			Banho banho = banhoRepository.findById(banhoId)
					.orElseThrow(() -> new
			ResourceNotFoundException("banho", "id_banho", banhoId));
			
			banho.setData_banho(banhoDetails.getData_banho());
			banho.setTempo_real(banhoDetails.getTempo_real());
			banho.setConsumo_real(banhoDetails.getConsumo_real());
			banho.setTempo_ideal(banhoDetails.getTempo_ideal());
			banho.setConsumo_ideal(banhoDetails.getConsumo_ideal());
			banho.setEconomia(banhoDetails.getEconomia());
			banho.setFk_usuario(banhoDetails.getFk_usuario());
			banho.setFk_chuveiro(banhoDetails.getFk_chuveiro());
			
			Banho updatedBanho = banhoRepository.save(banho);
			
			return updatedBanho;
		}
	
}

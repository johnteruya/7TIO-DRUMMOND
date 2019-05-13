package br.com.ecobanho.controller;

import br.com.ecobanho.exception.ResourceNotFoundException;
import br.com.ecobanho.model.Grupo;
import br.com.ecobanho.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GrupoController {

	@Autowired
	GrupoRepository grupoRepository;

	@GetMapping("/grupos")
	public List<Grupo> getAllGrupos() {
		return grupoRepository.findAll();
	}

	@PostMapping("/grupos")
	public Grupo createGrupo(@Valid @RequestBody Grupo grupo) {
		return grupoRepository.save(grupo);
	}

	@GetMapping("/grupos/{id_grupo}")
	public Grupo getGruposById_grupo(@PathVariable(value = "id_grupo") Long grupoId) {
		return grupoRepository.findById(grupoId)
				.orElseThrow(() -> new ResourceNotFoundException("Grupo", "id_grupo", grupoId));
	}
	
	@PostMapping("/grupos/{id_grupo}") public Grupo updateGrupo(@PathVariable(value = "id_grupo")Long grupoId,
		@Valid @RequestBody Grupo grupoDetails) {
		Grupo grupo = grupoRepository.findById(grupoId)
				.orElseThrow(() -> new
		ResourceNotFoundException("grupo", "id_grupo", grupoId));
		
		grupo.setNome_grupo(grupoDetails.getNome_grupo());
		grupo.setNum_integrantes(grupoDetails.getNum_integrantes());
		
		Grupo updatedGrupo = grupoRepository.save(grupo);
		
		return updatedGrupo;
	}
	
	@DeleteMapping("/grupos/{id_grupo}") public ResponseEntity<?>
	deleteNote(@PathVariable(value = "id_grupo") Long grupoId) {
		Grupo grupo = grupoRepository.findById(grupoId)
				.orElseThrow(() -> new
		ResourceNotFoundException("grupo", "id_grupo", grupoId));
		
		grupoRepository.delete(grupo);
		
		return ResponseEntity.ok().build();
	
	}

}

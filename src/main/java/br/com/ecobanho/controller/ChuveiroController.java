package br.com.ecobanho.controller;

import br.com.ecobanho.exception.ResourceNotFoundException;
import br.com.ecobanho.model.Chuveiro;
import br.com.ecobanho.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ChuveiroController {

	@Autowired
	ChuveiroRepository chuveiroRepository;

	@GetMapping("/chuveiros")
	public List<Chuveiro> getAllChuveiros() {
		return chuveiroRepository.findAll();
	}

	@PostMapping("/chuveiros")
	public Chuveiro createChuveiro(@Valid @RequestBody Chuveiro chuveiro) {
		return chuveiroRepository.save(chuveiro);
	}

	@GetMapping("/chuveiros/{id_chuveiro}")
	public Chuveiro getChuveirosById(@PathVariable(value = "id_chuveiro") Long chuveiroId) {
		return chuveiroRepository.findById(chuveiroId)
				.orElseThrow(() -> new ResourceNotFoundException("Chuveiro", "id_chuveiro", chuveiroId));
	}
	
    @PostMapping("/chuveiros/{id_chuveiro}")
    public Chuveiro updateChuveiro(@PathVariable(value = "id_chuveiro") Long chuveiroId,
                                           @Valid @RequestBody Chuveiro chuveiroDetails) {

        Chuveiro chuveiro = chuveiroRepository.findById(chuveiroId)
                .orElseThrow(() -> new ResourceNotFoundException("Chuveiro", "id_chuveiro", chuveiroId));

        chuveiro.setTipo_chuveiro(chuveiroDetails.getTipo_chuveiro());
        chuveiro.setVazao(chuveiroDetails.getVazao());

        Chuveiro updatedChuveiro = chuveiroRepository.save(chuveiro);
        return updatedChuveiro;
    }

    @DeleteMapping("/chuveiros/{id_chuveiro}")
    public ResponseEntity<?> deleteChuveiro(@PathVariable(value = "id_chuveiro") Long chuveiroId) {
        Chuveiro chuveiro = chuveiroRepository.findById(chuveiroId)
                .orElseThrow(() -> new ResourceNotFoundException("Chuveiro", "id_chuveiro", chuveiroId));

        chuveiroRepository.delete(chuveiro);

        return ResponseEntity.ok().build();
    }
    
}

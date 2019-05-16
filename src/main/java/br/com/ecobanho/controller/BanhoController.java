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

//	@PostMapping("/usuarios")
//	public Usuario createUsuario(@Valid @RequestBody Usuario usuario) {
//		return usuarioRepository.save(usuario);
//	}
//
//	@GetMapping("/usuarios/{id_usuario}")
//	public Usuario getUsuariosById_usuario(@PathVariable(value = "id_usuario") Long usuarioId) {
//		return usuarioRepository.findById(usuarioId)
//				.orElseThrow(() -> new ResourceNotFoundException("Usuario", "id_usuario", usuarioId));
//	}
//	
//	@DeleteMapping("/usuarios/{id_usuario}") public ResponseEntity<?>
//	deleteNote(@PathVariable(value = "id_usuario") Long usuarioId) {
//		Usuario usuario = usuarioRepository.findById(usuarioId)
//				.orElseThrow(() -> new
//		ResourceNotFoundException("usuario", "id_usuario", usuarioId));
//		
//		usuarioRepository.delete(usuario);
//		
//		return ResponseEntity.ok().build();
//	
//	}
//
//	@PostMapping("/usuarios/{id_usuario}") public Usuario updateUsuario(@PathVariable(value = "id_usuario")Long usuarioId,
//			@Valid @RequestBody Usuario usuarioDetails) {
//			Usuario usuario = usuarioRepository.findById(usuarioId)
//					.orElseThrow(() -> new
//			ResourceNotFoundException("usuario", "id_usuario", usuarioId));
//			
//			usuario.setNickname(usuarioDetails.getNickname());
//			usuario.setNome_usuario(usuarioDetails.getNome_usuario());
//			usuario.setSexo(usuarioDetails.getSexo());
//			usuario.setTempo_usual(usuarioDetails.getTempo_usual());
//			usuario.setFk_tipo_chuveiro(usuarioDetails.getFk_tipo_chuveiro());
//			usuario.setFk_id_grupo(usuarioDetails.getFk_id_grupo());
//			
//			Usuario updatedUsuario = usuarioRepository.save(usuario);
//			
//			return updatedUsuario;
//		}
//	
}

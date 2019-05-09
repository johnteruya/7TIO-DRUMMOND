package br.com.ecobanho.controller;

import br.com.ecobanho.exception.ResourceNotFoundException;
import br.com.ecobanho.model.Usuario;
import br.com.ecobanho.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;

	@GetMapping("/usuarios")
	public List<Usuario> getAllUsuarios() {
		return usuarioRepository.findAll();
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
//	@PutMapping("/usuarios/{id_usuario}") public Usuario updateuUsuario(@PathVariable(value = "id_usuario")Long usuarioId,
//		@Valid @RequestBody Usuario usuarioDetails) {
//		Usuario usuario = usuarioRepository.findById(usuarioId)
//				.orElseThrow(() -> new
//		ResourceNotFoundException("usuario", "id_usuario", usuarioId));
//		
//		usuario.setNome_usuario(usuarioDetails.getNome_usuario());
//		usuario.setNum_integrantes(usuarioDetails.getNum_integrantes());
//		
//		Usuario updatedUsuario = usuarioRepository.save(usuario);
//		
//		return updatedUsuario;
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

}

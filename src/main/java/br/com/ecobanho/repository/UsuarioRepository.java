package br.com.ecobanho.repository;

import br.com.ecobanho.model.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	List<Usuario> getUsuariosByNickname(String nickname);

}

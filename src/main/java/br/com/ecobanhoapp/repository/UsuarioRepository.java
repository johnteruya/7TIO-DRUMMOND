package br.com.ecobanhoapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.ecobanhoapp.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByLogin(String login);
}

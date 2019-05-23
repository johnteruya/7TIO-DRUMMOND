package br.com.ecobanho.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.ecobanho.model.View;

@Repository
public interface ViewRepository extends JpaRepository<View, Long> {
	
	
	@Query(value = "SELECT h FROM View h WHERE id_usuario = ?1  AND h.data_banho >=?2 AND h.data_banho <=?3")
	List<View> getViewByDate(Long idUsuario, String dataInicial, String dataFinal);
	
	
}
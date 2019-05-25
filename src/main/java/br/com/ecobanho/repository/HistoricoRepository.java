package br.com.ecobanho.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.ecobanho.model.Historico;

@Repository
public interface HistoricoRepository extends JpaRepository<Historico, Long> {
	
	
	@Query(value = "SELECT h.id_usuario, h.nome_usuario, h.nickname, h.economia, h.data_banho FROM Historico h WHERE id_usuario = ?1  AND h.data_banho >=?2 AND h.data_banho <=?3")
	List<Historico> getHistoricoByDate(Long idUsuario, String dataInicial, String dataFinal);
	
	
}
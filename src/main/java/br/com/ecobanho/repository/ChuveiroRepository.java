package br.com.ecobanho.repository;

import br.com.ecobanho.model.Chuveiro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChuveiroRepository extends JpaRepository<Chuveiro, Long> {


	@Query(value = "SELECT u FROM Chuveiro u ORDER BY id_chuveiro")
	List<Chuveiro> getChuveiroByTipo(String tipo_chuveiro);
	
}

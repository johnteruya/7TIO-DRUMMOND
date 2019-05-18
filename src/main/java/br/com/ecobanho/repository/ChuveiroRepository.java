package br.com.ecobanho.repository;

import br.com.ecobanho.model.Chuveiro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ChuveiroRepository extends JpaRepository<Chuveiro, Long> {


	@Query(value = "select u.id_chuveiro, u.nome_usuario, u.nickname, b.economia, b.data_banho from Usuario u inner join Banho b on u.id_chuveiro = b.fk_usuario where u.id_usuario = ?1 and data_banho >= ?2 and data_banho <= ?3 order by data_banho")
	
	List<Chuveiro> getUsuarioById(Long id_usuario);
	
//	
//	SELECT u FROM Chuveiro u ORDER BY id_chuveiro
//	SELECT p FROM Produto p WHERE p.description=?1
//	select c from Chuveiro c where c.id_chuveiro=?1
//	http://localhost:8080/api/idChuveiro?id_chuveiro=1
}

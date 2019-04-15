package br.com.ecobanhoapp.reposiroty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import br.com.ecobanhoapp.models.Produto;;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	@Query(value="SELECT p FROM Produto p WHERE p.description=?1")
	List<Produto> getProdutoByDescription(String description);
	

	
}

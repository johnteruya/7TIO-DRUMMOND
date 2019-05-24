//package br.com.ecobanho.repository;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import br.com.ecobanho.model.Ranking;
//
//@Repository
//public interface RankingRepository extends JpaRepository<Ranking, Long> {
//	
//	
//	@Query(value = "SELECT r FROM Ranking r WHERE id_grupo = ?1")
//	List<Ranking> getRankingByGroup(Long id_grupo);
//	
//	
//}

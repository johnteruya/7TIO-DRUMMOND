package br.com.ecobanho.repository;

import br.com.ecobanho.model.Chuveiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChuveiroRepository extends JpaRepository<Chuveiro, Long> {

}

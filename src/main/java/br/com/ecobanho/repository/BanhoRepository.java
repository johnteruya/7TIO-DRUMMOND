package br.com.ecobanho.repository;

import br.com.ecobanho.model.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanhoRepository extends JpaRepository<Banho, Long> {

}

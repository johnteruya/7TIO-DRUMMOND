package br.com.ecobanho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecobanho.model.Banho;

@Repository
public interface BanhoRepository extends JpaRepository<Banho, Long> {

}

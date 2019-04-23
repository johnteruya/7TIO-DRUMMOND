package br.com.ecobanho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecobanho.model.Chuveiro;


@Repository
public interface chuveiroRepository extends JpaRepository<Chuveiro, Long> {

}

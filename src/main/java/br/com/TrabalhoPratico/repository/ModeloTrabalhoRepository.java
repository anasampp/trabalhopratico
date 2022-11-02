package br.com.TrabalhoPratico.repository;

import models.ModeloTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("modeloTrabalhoRepository")
public interface ModeloTrabalhoRepository extends JpaRepository<ModeloTrabalho, Integer> {
}

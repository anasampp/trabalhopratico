package br.com.TrabalhoPratico.repository;

import models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("experienciaRepository")
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer> {
}

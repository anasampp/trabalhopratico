package br.com.TrabalhoPratico.repository;

import br.com.TrabalhoPratico.models.Competencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("competenciaRepository")
public interface CompetenciaRepository extends JpaRepository<Competencia, Integer> {
}

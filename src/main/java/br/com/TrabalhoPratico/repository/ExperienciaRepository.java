package br.com.TrabalhoPratico.repository;

import br.com.TrabalhoPratico.models.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("experienciaRepository")
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer> {
}

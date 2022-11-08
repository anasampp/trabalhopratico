package br.com.TrabalhoPratico.repository;

import br.com.TrabalhoPratico.models.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("candidatoRepository")
public interface CandidatoRepository extends JpaRepository<Candidato, Integer> {
}

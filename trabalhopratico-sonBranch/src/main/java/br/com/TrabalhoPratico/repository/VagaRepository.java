package br.com.TrabalhoPratico.repository;

import br.com.TrabalhoPratico.models.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vagaRepository")
public interface VagaRepository extends JpaRepository<Vaga, Integer> {
}

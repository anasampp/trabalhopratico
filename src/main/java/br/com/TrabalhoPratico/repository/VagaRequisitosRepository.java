package br.com.TrabalhoPratico.repository;

import br.com.TrabalhoPratico.models.VagaRequisitos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("vagaRequisitosRepository")
public interface VagaRequisitosRepository extends JpaRepository<VagaRequisitos, Integer> {
}

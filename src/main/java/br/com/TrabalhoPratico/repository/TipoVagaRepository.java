package br.com.TrabalhoPratico.repository;

import br.com.TrabalhoPratico.models.TipoVaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tipoVagaService")
public interface TipoVagaRepository extends JpaRepository<TipoVaga, Integer> {
}

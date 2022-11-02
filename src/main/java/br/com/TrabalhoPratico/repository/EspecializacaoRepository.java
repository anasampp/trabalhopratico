package br.com.TrabalhoPratico.repository;

import models.Especializacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("especializacaoRepository")
public interface EspecializacaoRepository extends JpaRepository<Especializacao, Integer> {
}

package br.com.TrabalhoPratico.repository;

import models.Formacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("formacaoRepository")
public interface FormacaoRepository extends JpaRepository<Formacao, Integer> {
}

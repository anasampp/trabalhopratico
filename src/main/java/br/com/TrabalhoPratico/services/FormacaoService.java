package br.com.TrabalhoPratico.services;

import models.Formacao;

import java.util.List;
import java.util.Optional;

public interface FormacaoService {
    Optional<Formacao> getFormacaoById(Integer id);
    List<Formacao> getAllFormacao();
    void deleteAllFormacao();
    void deleteFormacaoById(Integer id);
    void deleteFormacao(Formacao formacao);
    void updateFormacaoById(Integer id, Formacao formacao);
    void updateFormacao(Formacao formacao);
    void insertFormacao(Formacao formacao);
}

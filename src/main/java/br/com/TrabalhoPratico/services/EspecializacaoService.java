package br.com.TrabalhoPratico.services;

import models.Especializacao;

import java.util.List;
import java.util.Optional;

public interface EspecializacaoService {
    Optional<Especializacao> getEspecializacaoById(Integer id);
    List<Especializacao> getAllEspecializacao();
    void deleteAllEspecializacao();
    void deleteEspecializacaoById(Integer id);
    void deleteEspecializacao(Especializacao especializacao);
    void updateEspecializacaoById(Integer id, Especializacao especializacao);
    void updateEspecializacao(Especializacao especializacao);
    void insertEspecializacao(Especializacao especializacao);
}

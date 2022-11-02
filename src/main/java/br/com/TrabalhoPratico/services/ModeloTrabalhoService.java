package br.com.TrabalhoPratico.services;

import models.Formacao;
import models.ModeloTrabalho;

import java.util.List;
import java.util.Optional;

public interface ModeloTrabalhoService {
    Optional<ModeloTrabalho> getModeloTrabalhoById(Integer id);
    List<ModeloTrabalho> getAllModeloTrabalho();
    void deleteAllModeloTrabalho();
    void deleteModeloTrabalhoById(Integer id);
    void deleteModeloTrabalho(ModeloTrabalho modeloTrabalho);
    void updateModeloTrabalhoById(Integer id, ModeloTrabalho modeloTrabalho);
    void updateModeloTrabalho(ModeloTrabalho modeloTrabalho);
    void insertModeloTrabalho(ModeloTrabalho modeloTrabalho);
}

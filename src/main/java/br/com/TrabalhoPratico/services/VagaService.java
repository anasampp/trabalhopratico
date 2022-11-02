package br.com.TrabalhoPratico.services;

import models.Vaga;

import java.util.List;
import java.util.Optional;

public interface VagaService {
    Optional<Vaga> getVagaById(Integer id);
    List<Vaga> getAllVaga();
    void deleteAllVaga();
    void deleteVagaById(Integer id);
    void deleteVaga(Vaga vaga);
    void updateVagaById(Integer id, Vaga vaga);
    void updateVaga(Vaga vaga);
    void insertVaga(Vaga vaga);
}

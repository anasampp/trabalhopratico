package br.com.TrabalhoPratico.services;

import models.TipoVaga;

import java.util.List;
import java.util.Optional;

public interface TipoVagaService {
    Optional<TipoVaga> getTipoVagaById(Integer id);
    List<TipoVaga> getAllTipoVaga();
    void deleteAllTipoVaga();
    void deleteTipoVagaById(Integer id);
    void deleteTipoVaga(TipoVaga tipoVaga);
    void updateTipoVagaById(Integer id, TipoVaga tipoVaga);
    void updateTipoVaga(TipoVaga tipoVaga);
    void insertTipoVaga(TipoVaga tipoVaga);
}

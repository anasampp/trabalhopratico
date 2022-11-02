package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.TipoVagaRepository;
import models.TipoUsuario;
import models.TipoVaga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("tipoVagaService")
public class TipoVagaServiceImpl implements TipoVagaService{
    @Autowired
    TipoVagaRepository tipoVagaRepository;

    @Override
    public Optional<TipoVaga> getTipoVagaById(Integer id) {
        return tipoVagaRepository.findById(id);
    }

    @Override
    public List<TipoVaga> getAllTipoVaga() {
        return tipoVagaRepository.findAll();
    }

    @Override
    public void deleteAllTipoVaga() {
        tipoVagaRepository.deleteAll();
    }

    @Override
    public void deleteTipoVagaById(Integer id) {
        tipoVagaRepository.deleteById(id);
    }

    @Override
    public void deleteTipoVaga(TipoVaga tipoVaga) {
        tipoVagaRepository.delete(tipoVaga);
    }

    @Override
    public void updateTipoVagaById(Integer id, TipoVaga tipoVaga) {
        Optional<TipoVaga> getTipoVaga = getTipoVagaById(id);
        tipoVagaRepository.save(tipoVaga);
    }

    @Override
    public void updateTipoVaga(TipoVaga tipoVaga) {
        tipoVagaRepository.save(tipoVaga);
    }

    @Override
    public void insertTipoVaga(TipoVaga tipoVaga) {
        tipoVagaRepository.save(tipoVaga);
    }
}

package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.VagaRepository;
import models.Vaga;
import models.VagaRequisitos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("vagaService")
public class VagaServiceImpl implements VagaService {
    @Autowired
    VagaRepository vagaRepository;

    @Override
    public Optional<Vaga> getVagaById(Integer id) {
        return vagaRepository.findById(id);
    }

    @Override
    public List<Vaga> getAllVaga() {
        return vagaRepository.findAll();
    }

    @Override
    public void deleteAllVaga() {
        vagaRepository.deleteAll();
    }

    @Override
    public void deleteVagaById(Integer id) {
        vagaRepository.deleteById(id);
    }

    @Override
    public void deleteVaga(Vaga vaga) {
        vagaRepository.delete(vaga);
    }

    @Override
    public void updateVagaById(Integer id, Vaga vaga) {
        Optional<Vaga> getVaga = getVagaById(id);
        getVaga.get().setNomeVaga(vaga.getNomeVaga());
        getVaga.get().setTipoVaga(vaga.getTipoVaga());
        getVaga.get().setFaixaSalarial(vaga.getFaixaSalarial());
        getVaga.get().setObservacao(vaga.getObservacao());
        getVaga.get().setDescricao(vaga.getDescricao());
        getVaga.get().setCargaHoraria(vaga.getCargaHoraria());
        getVaga.get().setModeloTrabalho(vaga.getModeloTrabalho());
        vagaRepository.save(vaga);
    }

    @Override
    public void updateVaga(Vaga vaga) {
        vagaRepository.save(vaga);
    }

    @Override
    public void insertVaga(Vaga vaga) {
        vagaRepository.save(vaga);
    }
}

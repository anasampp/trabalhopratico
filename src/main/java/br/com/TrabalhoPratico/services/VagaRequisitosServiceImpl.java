package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.VagaRequisitosRepository;
import models.Usuario;
import models.VagaRequisitos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("vagaRequisitosService")
public class VagaRequisitosServiceImpl implements VagaRequisitosService {
    @Autowired
    VagaRequisitosRepository vagaRequisitosRepository;

    @Override
    public Optional<VagaRequisitos> getVagaRequisitosById(Integer id) {
        return vagaRequisitosRepository.findById(id);
    }

    @Override
    public List<VagaRequisitos> getAllVagaRequisitos() {
        return vagaRequisitosRepository.findAll();
    }

    @Override
    public void deleteAllVagaRequisitos() {
        vagaRequisitosRepository.deleteAll();
    }

    @Override
    public void deleteVagaRequisitosById(Integer id) {
        vagaRequisitosRepository.deleteById(id);
    }

    @Override
    public void deleteVagaRequisitos(VagaRequisitos vagaRequisitos) {
        vagaRequisitosRepository.delete(vagaRequisitos);
    }

    @Override
    public void updateVagaRequisitosById(Integer id, VagaRequisitos vagaRequisitos) {
        Optional<VagaRequisitos> getVagaRequisitos = getVagaRequisitosById(id);
        getVagaRequisitos.get().setExperienciaMin(vagaRequisitos.getExperienciaMin());
        getVagaRequisitos.get().setFormacaoMinima(vagaRequisitos.getFormacaoMinima());
        getVagaRequisitos.get().setResidirCidade(vagaRequisitos.isResidirCidade());
        getVagaRequisitos.get().setNecessitaExperiencia(vagaRequisitos.isNecessitaExperiencia());
        vagaRequisitosRepository.save(vagaRequisitos);
    }

    @Override
    public void updateVagaRequisitos(VagaRequisitos vagaRequisitos) {
        vagaRequisitosRepository.save(vagaRequisitos);
    }

    @Override
    public void insertVagaRequisitos(VagaRequisitos vagaRequisitos) {
        vagaRequisitosRepository.save(vagaRequisitos);
    }
}

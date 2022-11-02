package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.CompetenciaRepository;
import models.Competencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("competenciaService")
public class CompetenciaServiceImpl implements CompetenciaService {
    @Autowired
    CompetenciaRepository competenciaRepository;

    @Override
    public Optional<Competencia> getCompetenciaById(Integer id) {
        return competenciaRepository.findById(id);
    }

    @Override
    public List<Competencia> getAllCompetencia() {
        return competenciaRepository.findAll();
    }

    @Override
    public void deleteAllCompetencia() {
        competenciaRepository.deleteAll();
    }

    @Override
    public void deleteCompetenciaById(Integer id) {
        competenciaRepository.deleteById(id);
    }

    @Override
    public void deleteCompetencia(Competencia competencia) {
        competenciaRepository.delete(competencia);
    }

    @Override
    public void updateCompetenciaById(Integer id, Competencia competencia) {
        Optional<Competencia> getCompetencia = getCompetenciaById(id);
        getCompetencia.get().setConhecimento(competencia.getConhecimento());
        competenciaRepository.save(competencia);
    }

    @Override
    public void updateCompetencia(Competencia competencia) {
        competenciaRepository.save(competencia);
    }

    @Override
    public void insertCompetencia(Competencia competencia) {
        competenciaRepository.save(competencia);
    }
}

package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.ExperienciaRepository;
import br.com.TrabalhoPratico.models.Experiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("experienciaService")
public class ExperienciaServiceImpl implements ExperienciaService {
    @Autowired
    ExperienciaRepository experienciaRepository;

    @Override
    public Optional<Experiencia> getExperienciaById(Integer id) {
        return experienciaRepository.findById(id);
    }

    @Override
    public List<Experiencia> getAllExperiencia() {
        return experienciaRepository.findAll();
    }

    @Override
    public void deleteAllExperiencia() {
        experienciaRepository.deleteAll();
    }

    @Override
    public void deleteExperienciaById(Integer id) {
        experienciaRepository.deleteById(id);
    }

    @Override
    public void deleteExperiencia(Experiencia experiencia) {
        experienciaRepository.delete(experiencia);
    }

    @Override
    public void updateExperienciaById(Integer id, Experiencia experiencia) {
        Optional<Experiencia> getExperiencia = getExperienciaById(id);
        getExperiencia.get().setDataInicio(experiencia.getDataInicio());
        getExperiencia.get().setDataFim(experiencia.getDataFim());
        getExperiencia.get().setCargo(experiencia.getCargo());
        getExperiencia.get().setDescricao(experiencia.getDescricao());
        experienciaRepository.save(experiencia);
    }

    @Override
    public void updateExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }

    @Override
    public void insertExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }
}

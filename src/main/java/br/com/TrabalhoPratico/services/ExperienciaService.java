package br.com.TrabalhoPratico.services;

import models.Experiencia;

import java.util.List;
import java.util.Optional;

public interface ExperienciaService {
    Optional<Experiencia> getExperienciaById(Integer id);
    List<Experiencia> getAllExperiencia();
    void deleteAllExperiencia();
    void deleteExperienciaById(Integer id);
    void deleteExperiencia(Experiencia experiencia);
    void updateExperienciaById(Integer id, Experiencia experiencia);
    void updateExperiencia(Experiencia experiencia);
    void insertExperiencia(Experiencia experiencia);
}

package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.models.Competencia;

import java.util.List;
import java.util.Optional;

public interface CompetenciaService {

    Optional<Competencia> getCompetenciaById(Integer id);
    List<Competencia> getAllCompetencia();
    void deleteAllCompetencia();
    void deleteCompetenciaById(Integer id);
    void deleteCompetencia(Competencia competencia);
    void updateCompetenciaById(Integer id, Competencia competencia);
    void updateCompetencia(Competencia competencia);
    void insertCompetencia(Competencia competencia);
}

package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.models.Candidato;

import java.util.List;
import java.util.Optional;

public interface CandidatoService {

    Optional<Candidato> getCandidatoById(Integer id);
    List<Candidato> getAllCandidatos();
    void deleteAllCandidatos();
    void deleteCandidatoById(Integer id);
    void deleteCandidato(Candidato candidato);
    void updateCandidatoById(Integer id, Candidato candidato);
    void updateCandidato(Candidato candidato);
    void insertCandidato(Candidato candidato);
}

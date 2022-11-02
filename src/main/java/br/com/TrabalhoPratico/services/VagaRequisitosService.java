package br.com.TrabalhoPratico.services;

import models.Usuario;
import models.VagaRequisitos;

import java.util.List;
import java.util.Optional;

public interface VagaRequisitosService {
    Optional<VagaRequisitos> getVagaRequisitosById(Integer id);
    List<VagaRequisitos> getAllVagaRequisitos();
    void deleteAllVagaRequisitos();
    void deleteVagaRequisitosById(Integer id);
    void deleteVagaRequisitos(VagaRequisitos vagaRequisitos);
    void updateVagaRequisitosById(Integer id, VagaRequisitos vagaRequisitos);
    void updateVagaRequisitos(VagaRequisitos vagaRequisitos);
    void insertVagaRequisitos(VagaRequisitos vagaRequisitos);
}

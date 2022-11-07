package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.CandidatoRepository;
import br.com.TrabalhoPratico.models.Candidato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("candidatoService")
public class CandidatoServiceImpl implements CandidatoService {
    @Autowired
    CandidatoRepository candidatoRepository;

    @Override
    public Optional<Candidato> getCandidatoById(Integer id) {
        return candidatoRepository.findById(id);
    }

    @Override
    public List<Candidato> getAllCandidatos() {
        return candidatoRepository.findAll();
    }

    @Override
    public void deleteAllCandidatos() {
        candidatoRepository.deleteAll();
    }

    @Override
    public void deleteCandidatoById(Integer id) {
        candidatoRepository.deleteById(id);
    }

    @Override
    public void deleteCandidato(Candidato candidato) {
        candidatoRepository.delete(candidato);
    }

    @Override
    public void updateCandidatoById(Integer id, Candidato candidato) {
        Optional<Candidato> getCandidato = getCandidatoById(id);
        getCandidato.get().setCpf(candidato.getCpf());
        getCandidato.get().setDataNascimento(candidato.getDataNascimento());
        getCandidato.get().setTelefone(candidato.getTelefone());
        getCandidato.get().setEndereco(candidato.getEndereco());
        getCandidato.get().setLinkGit(candidato.getLinkGit());
        getCandidato.get().setLinkLinkedln(candidato.getLinkLinkedln());
        candidatoRepository.save(candidato);
    }

    @Override
    public void updateCandidato(Candidato candidato) {
        candidatoRepository.save(candidato);
    }

    @Override
    public void insertCandidato(Candidato candidato) {
        candidatoRepository.save(candidato);
    }
}

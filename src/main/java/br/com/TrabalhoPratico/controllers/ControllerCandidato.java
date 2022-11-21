package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.Candidato;
import br.com.TrabalhoPratico.services.CandidatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerCandidato {
    @Autowired
    private CandidatoService candidatoService;

    @RequestMapping(value = "candidatos", method = RequestMethod.GET)
    public List<Candidato> getCandidatos(){
        return candidatoService.getAllCandidatos();
    }
    @RequestMapping(value = "candidatos/{id}", method = RequestMethod.GET)
    public Optional<Candidato> getCandidatoById(@PathVariable("id") Integer id){
        return candidatoService.getCandidatoById(id);
    }
    @RequestMapping(value = "candidatos", method = RequestMethod.POST)
    public void insertCandidato(@RequestBody  Candidato candidato){
        candidatoService.insertCandidato(candidato);
    }
    @RequestMapping(value = "candidatos", method = RequestMethod.PUT)
    public void updateCandidato(@RequestBody Candidato candidato){
        candidatoService.updateCandidato(candidato);
    }
    @RequestMapping(value = "alunos/{id}", method = RequestMethod.DELETE)
    public void deleteAluno(@PathVariable("id") Integer id){
        candidatoService.deleteCandidatoById(id);
    }
    @RequestMapping(value = "candidatos", method = RequestMethod.DELETE)
    public void deleteAllAlunos(){
        candidatoService.deleteAllCandidatos();
    }
}

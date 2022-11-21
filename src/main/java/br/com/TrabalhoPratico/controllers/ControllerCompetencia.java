package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.Candidato;
import br.com.TrabalhoPratico.models.Competencia;
import br.com.TrabalhoPratico.services.CompetenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerCompetencia {
    @Autowired
    private CompetenciaService competenciaService;

    @RequestMapping(value = "competencias", method = RequestMethod.GET)
    public List<Competencia> getCompetencias(){
        return competenciaService.getAllCompetencia();
    }
    @RequestMapping(value = "competencias/{id}", method = RequestMethod.GET)
    public Optional<Competencia> getCompetenciaById(@PathVariable("id") Integer id){
        return competenciaService.getCompetenciaById(id);
    }
    @RequestMapping(value = "competencias", method = RequestMethod.POST)
    public void insertCompetencia(@RequestBody Competencia competencia){
        competenciaService.insertCompetencia(competencia);
    }
    @RequestMapping(value = "competencias", method = RequestMethod.PUT)
    public void updateCompetencia(@RequestBody Competencia competencia){
        competenciaService.updateCompetencia(competencia);
    }
    @RequestMapping(value = "competencias/{id}", method = RequestMethod.DELETE)
    public void deleteCompetencia(@PathVariable("id") Integer id){
        competenciaService.deleteCompetenciaById(id);
    }
    @RequestMapping(value = "competencias", method = RequestMethod.DELETE)
    public void deleteAllCompetencias(){
        competenciaService.deleteAllCompetencia();
    }
}

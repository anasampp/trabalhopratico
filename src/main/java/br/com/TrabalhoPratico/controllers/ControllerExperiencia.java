package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.Especializacao;
import br.com.TrabalhoPratico.models.Experiencia;
import br.com.TrabalhoPratico.services.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerExperiencia {
    @Autowired
    ExperienciaService experienciaService;

    @RequestMapping(value = "experiencias", method = RequestMethod.GET)
    public List<Experiencia> getExperiencia(){
        return experienciaService.getAllExperiencia();
    }
    @RequestMapping(value = "experiencias/{id}", method = RequestMethod.GET)
    public Optional<Experiencia> getExperienciaById(@PathVariable("id") Integer id){
        return experienciaService.getExperienciaById(id);
    }
    @RequestMapping(value = "experiencias", method = RequestMethod.POST)
    public void insertExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.insertExperiencia(experiencia);
    }
    @RequestMapping(value = "experiencias", method = RequestMethod.PUT)
    public void updateExperiencia(@RequestBody Experiencia experiencia){
        experienciaService.updateExperiencia(experiencia);
    }
    @RequestMapping(value = "experiencias/{id}", method = RequestMethod.DELETE)
    public void deleteExperiencia(@PathVariable("id") Integer id){
        experienciaService.deleteExperienciaById(id);
    }
    @RequestMapping(value = "experiencias", method = RequestMethod.DELETE)
    public void deleteAllExperiencia(){
        experienciaService.deleteAllExperiencia();
    }
}

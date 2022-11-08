package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.Formacao;
import br.com.TrabalhoPratico.models.ModeloTrabalho;
import br.com.TrabalhoPratico.services.ModeloTrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/modelostrabalho")
public class ControllerModeloTrabalho {
    @Autowired
    ModeloTrabalhoService modeloTrabalhoService;

    @RequestMapping(value = "modelostrabalho", method = RequestMethod.GET)
    public List<ModeloTrabalho> getModeloTrabalho(){
        return modeloTrabalhoService.getAllModeloTrabalho();
    }
    @RequestMapping(value = "modelostrabalho/{id}", method = RequestMethod.GET)
    public Optional<ModeloTrabalho> getModeloTrabalhoById(@PathVariable("id") Integer id){
        return modeloTrabalhoService.getModeloTrabalhoById(id);
    }
    @RequestMapping(value = "modelostrabalho", method = RequestMethod.POST)
    public void insertModeloTrabalho(@RequestBody ModeloTrabalho formacao){
        modeloTrabalhoService.insertModeloTrabalho(formacao);
    }
    @RequestMapping(value = "modelostrabalho", method = RequestMethod.PUT)
    public void updateModeloTrabalho(@RequestBody ModeloTrabalho formacao){
        modeloTrabalhoService.updateModeloTrabalho(formacao);
    }
    @RequestMapping(value = "modelostrabalho/{id}", method = RequestMethod.DELETE)
    public void deleteModeloTrabalho(@PathVariable("id") Integer id){
        modeloTrabalhoService.deleteModeloTrabalhoById(id);
    }
    @RequestMapping(value = "modelostrabalho", method = RequestMethod.DELETE)
    public void deleteAllModeloTrabalho(){
        modeloTrabalhoService.deleteAllModeloTrabalho();
    }
}

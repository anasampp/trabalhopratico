package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.Experiencia;
import br.com.TrabalhoPratico.models.Formacao;
import br.com.TrabalhoPratico.services.FormacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerFormacao {
    @Autowired
    FormacaoService formacaoService;

    @RequestMapping(value = "formacoes", method = RequestMethod.GET)
    public List<Formacao> getFormacao(){
        return formacaoService.getAllFormacao();
    }
    @RequestMapping(value = "formacoes/{id}", method = RequestMethod.GET)
    public Optional<Formacao> getFormacaoById(@PathVariable("id") Integer id){
        return formacaoService.getFormacaoById(id);
    }
    @RequestMapping(value = "formacoes", method = RequestMethod.POST)
    public void insertFormacao(@RequestBody Formacao formacao){
        formacaoService.insertFormacao(formacao);
    }
    @RequestMapping(value = "formacoes", method = RequestMethod.PUT)
    public void updateFormacao(@RequestBody Formacao formacao){
        formacaoService.updateFormacao(formacao);
    }
    @RequestMapping(value = "formacoes/{id}", method = RequestMethod.DELETE)
    public void deleteFormacao(@PathVariable("id") Integer id){
        formacaoService.deleteFormacaoById(id);
    }
    @RequestMapping(value = "formacoes", method = RequestMethod.DELETE)
    public void deleteAllFormacao(){
        formacaoService.deleteAllFormacao();
    }
}

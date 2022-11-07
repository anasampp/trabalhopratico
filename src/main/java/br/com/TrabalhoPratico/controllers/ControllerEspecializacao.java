package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.Endereco;
import br.com.TrabalhoPratico.models.Especializacao;
import br.com.TrabalhoPratico.services.EspecializacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/especializacoes")
public class ControllerEspecializacao {
    @Autowired
    EspecializacaoService especializacaoService;

    @RequestMapping(value = "especializacoes", method = RequestMethod.GET)
    public List<Especializacao> getEspecializacao(){
        return especializacaoService.getAllEspecializacao();
    }
    @RequestMapping(value = "especializacoes/{id}", method = RequestMethod.GET)
    public Optional<Especializacao> getEspecializacaoById(@PathVariable("id") Integer id){
        return especializacaoService.getEspecializacaoById(id);
    }
    @RequestMapping(value = "especializacoes", method = RequestMethod.POST)
    public void insertEspeacializacao(@RequestBody Especializacao especializacao){
        especializacaoService.insertEspecializacao(especializacao);
    }
    @RequestMapping(value = "especializacoes", method = RequestMethod.PUT)
    public void updateEspecializacao(@RequestBody Especializacao especializacao){
        especializacaoService.updateEspecializacao(especializacao);
    }
    @RequestMapping(value = "especializacoes/{id}", method = RequestMethod.DELETE)
    public void deleteEspecializacao(@PathVariable("id") Integer id){
        especializacaoService.deleteEspecializacaoById(id);
    }
    @RequestMapping(value = "especializacoes", method = RequestMethod.DELETE)
    public void deleteAllEspecializacao(){
        especializacaoService.deleteAllEspecializacao();
    }
}

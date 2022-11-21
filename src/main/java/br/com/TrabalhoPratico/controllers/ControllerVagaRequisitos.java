package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.Vaga;
import br.com.TrabalhoPratico.models.VagaRequisitos;
import br.com.TrabalhoPratico.services.VagaRequisitosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerVagaRequisitos {
    @Autowired
    VagaRequisitosService vagaRequisitosService;

    @RequestMapping(value = "vagasrequisitos", method = RequestMethod.GET)
    public List<VagaRequisitos> getVagaRequisitos(){
        return vagaRequisitosService.getAllVagaRequisitos();
    }
    @RequestMapping(value = "vagasrequisitos/{id}", method = RequestMethod.GET)
    public Optional<VagaRequisitos> getVagaRequisitosById(@PathVariable("id") Integer id){
        return vagaRequisitosService.getVagaRequisitosById(id);
    }
    @RequestMapping(value = "vagasrequisitos", method = RequestMethod.POST)
    public void insertVagaRequisitos(@RequestBody VagaRequisitos vagaRequisitos){
        vagaRequisitosService.insertVagaRequisitos(vagaRequisitos);
    }
    @RequestMapping(value = "vagasrequisitos", method = RequestMethod.PUT)
    public void updateVagaRequisitos(@RequestBody VagaRequisitos vagaRequisitos){
        vagaRequisitosService.updateVagaRequisitos(vagaRequisitos);
    }
    @RequestMapping(value = "vagasrequisitos/{id}", method = RequestMethod.DELETE)
    public void deleteVagaRequisitos(@PathVariable("id") Integer id){
        vagaRequisitosService.deleteVagaRequisitosById(id);
    }
    @RequestMapping(value = "vagasrequisitos", method = RequestMethod.DELETE)
    public void deleteAllVagaRequisitos(){
        vagaRequisitosService.deleteAllVagaRequisitos();
    }
}

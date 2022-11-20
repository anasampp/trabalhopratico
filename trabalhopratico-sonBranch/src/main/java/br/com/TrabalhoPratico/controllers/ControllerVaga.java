package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.Usuario;
import br.com.TrabalhoPratico.models.Vaga;
import br.com.TrabalhoPratico.services.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vagas")
public class ControllerVaga {
    @Autowired
    VagaService vagaService;

    @RequestMapping(value = "vagas", method = RequestMethod.GET)
    public List<Vaga> getVaga(){
        return vagaService.getAllVaga();
    }
    @RequestMapping(value = "vagas/{id}", method = RequestMethod.GET)
    public Optional<Vaga> getVagaById(@PathVariable("id") Integer id){
        return vagaService.getVagaById(id);
    }
    @RequestMapping(value = "vagas", method = RequestMethod.POST)
    public void insertVaga(@RequestBody Vaga vaga){
        vagaService.insertVaga(vaga);
    }
    @RequestMapping(value = "vagas", method = RequestMethod.PUT)
    public void updateVaga(@RequestBody Vaga vaga){
        vagaService.updateVaga(vaga);
    }
    @RequestMapping(value = "vagas/{id}", method = RequestMethod.DELETE)
    public void deleteVaga(@PathVariable("id") Integer id){
        vagaService.deleteVagaById(id);
    }
    @RequestMapping(value = "vagas", method = RequestMethod.DELETE)
    public void deleteAllVaga(){
        vagaService.deleteAllVaga();
    }
}

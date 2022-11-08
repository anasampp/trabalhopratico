package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.TipoUsuario;
import br.com.TrabalhoPratico.models.TipoVaga;
import br.com.TrabalhoPratico.services.TipoVagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipovagas")
public class ControllerTipoVaga {
    @Autowired
    TipoVagaService tipoVagaService;

    @RequestMapping(value = "tipovagas", method = RequestMethod.GET)
    public List<TipoVaga> getTipoVaga(){
        return tipoVagaService.getAllTipoVaga();
    }
    @RequestMapping(value = "tipovagas/{id}", method = RequestMethod.GET)
    public Optional<TipoVaga> getTipoVagaById(@PathVariable("id") Integer id){
        return tipoVagaService.getTipoVagaById(id);
    }
    @RequestMapping(value = "tipovagas", method = RequestMethod.POST)
    public void insertTipoVaga(@RequestBody TipoVaga tipoVaga){
        tipoVagaService.insertTipoVaga(tipoVaga);
    }
    @RequestMapping(value = "tipovagas", method = RequestMethod.PUT)
    public void updateTipoVaga(@RequestBody TipoVaga tipoVaga){
        tipoVagaService.updateTipoVaga(tipoVaga);
    }
    @RequestMapping(value = "tipovagas/{id}", method = RequestMethod.DELETE)
    public void deleteTipoVaga(@PathVariable("id") Integer id){
        tipoVagaService.deleteTipoVagaById(id);
    }
    @RequestMapping(value = "tipovagas", method = RequestMethod.DELETE)
    public void deleteAllTipoVaga(){
        tipoVagaService.deleteAllTipoVaga();
    }
}

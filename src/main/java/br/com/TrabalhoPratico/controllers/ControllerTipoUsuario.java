package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.ModeloTrabalho;
import br.com.TrabalhoPratico.models.TipoUsuario;
import br.com.TrabalhoPratico.services.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipoUsuarios")
public class ControllerTipoUsuario {
    @Autowired
    TipoUsuarioService tipoUsuarioService;

    @RequestMapping(value = "tipoUsuarios", method = RequestMethod.GET)
    public List<TipoUsuario> getTipoUsuario(){
        return tipoUsuarioService.getAllTipoUsuario();
    }
    @RequestMapping(value = "tipoUsuarios/{id}", method = RequestMethod.GET)
    public Optional<TipoUsuario> getTipoUsuarioById(@PathVariable("id") Integer id){
        return tipoUsuarioService.getTipoUsuarioById(id);
    }
    @RequestMapping(value = "tipoUsuarios", method = RequestMethod.POST)
    public void insertTipoUsuario(@RequestBody TipoUsuario tipoUsuario){
        tipoUsuarioService.insertTipoUsuario(tipoUsuario);
    }
    @RequestMapping(value = "tipoUsuarios", method = RequestMethod.PUT)
    public void updateTipoUsuario(@RequestBody TipoUsuario tipoUsuario){
        tipoUsuarioService.updateTipoUsuario(tipoUsuario);
    }
    @RequestMapping(value = "tipoUsuarios/{id}", method = RequestMethod.DELETE)
    public void deleteTipoUsuario(@PathVariable("id") Integer id){
        tipoUsuarioService.deleteTipoUsuarioById(id);
    }
    @RequestMapping(value = "tipoUsuarios", method = RequestMethod.DELETE)
    public void deleteAllTipoUsuario(){
        tipoUsuarioService.deleteAllTipoUsuario();
    }
}

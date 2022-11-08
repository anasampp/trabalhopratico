package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.TipoVaga;
import br.com.TrabalhoPratico.models.Usuario;
import br.com.TrabalhoPratico.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class ControllerUsuario {
    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuario(){
        return usuarioService.getAllUsuario();
    }
    @RequestMapping(value = "usuarios/{id}", method = RequestMethod.GET)
    public Optional<Usuario> getUsuarioById(@PathVariable("id") Integer id){
        return usuarioService.getUsuarioById(id);
    }
    @RequestMapping(value = "usuarios", method = RequestMethod.POST)
    public void insertUsuario(@RequestBody Usuario usuario){
        usuarioService.insertUsuario(usuario);
    }
    @RequestMapping(value = "usuarios", method = RequestMethod.PUT)
    public void updateUsuario(@RequestBody Usuario usuario){
        usuarioService.updateUsuario(usuario);
    }
    @RequestMapping(value = "usuarios/{id}", method = RequestMethod.DELETE)
    public void deleteUsuario(@PathVariable("id") Integer id){
        usuarioService.deleteUsuarioById(id);
    }
    @RequestMapping(value = "usuarios", method = RequestMethod.DELETE)
    public void deleteAllUsuario(){
        usuarioService.deleteAllUsuario();
    }
}

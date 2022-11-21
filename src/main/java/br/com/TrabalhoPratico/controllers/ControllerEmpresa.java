package br.com.TrabalhoPratico.controllers;

import br.com.TrabalhoPratico.models.Competencia;
import br.com.TrabalhoPratico.models.Empresa;
import br.com.TrabalhoPratico.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ControllerEmpresa {
    @Autowired
    EmpresaService empresaService;

    @RequestMapping(value = "empresas", method = RequestMethod.GET)
    public List<Empresa> getEmpresas(){
        return empresaService.getAllEmpresa();
    }
    @RequestMapping(value = "empresas/{id}", method = RequestMethod.GET)
    public Optional<Empresa> getEmpresaById(@PathVariable("id") Integer id){
        return empresaService.getEmpresaById(id);
    }
    @RequestMapping(value = "empresas", method = RequestMethod.POST)
    public void insertEmpresa(@RequestBody Empresa empresa){
        empresaService.insertEmpresa(empresa);
    }
    @RequestMapping(value = "empresas", method = RequestMethod.PUT)
    public void updateEmpresa(@RequestBody Empresa empresa){
        empresaService.updateEmpresa(empresa);
    }
    @RequestMapping(value = "empresas/{id}", method = RequestMethod.DELETE)
    public void deleteEmpresa(@PathVariable("id") Integer id){
        empresaService.deleteEmpresaById(id);
    }
    @RequestMapping(value = "empresas", method = RequestMethod.DELETE)
    public void deleteAllEmpresa(){
        empresaService.deleteAllEmpresa();
    }
}

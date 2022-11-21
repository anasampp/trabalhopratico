package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.models.Empresa;

import java.util.List;
import java.util.Optional;

public interface EmpresaService {
    Optional<Empresa> getEmpresaById(Integer id);
    List<Empresa> getAllEmpresa();
    void deleteAllEmpresa();
    void deleteEmpresaById(Integer id);
    void deleteEmpresa(Empresa empresa);
    void updateEmpresaById(Integer id, Empresa empresa);
    void updateEmpresa(Empresa empresa);
    void insertEmpresa(Empresa empresa);
}

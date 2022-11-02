package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.EmpresaRepository;
import models.Competencia;
import models.Empresa;
import models.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("empresaService")
public class EmpresaServiceImpl implements EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;

    @Override
    public Optional<Empresa> getEmpresaById(Integer id) {
        return empresaRepository.findById(id);
    }

    @Override
    public List<Empresa> getAllEmpresa() {
        return empresaRepository.findAll();
    }

    @Override
    public void deleteAllEmpresa() {
        empresaRepository.deleteAll();
    }

    @Override
    public void deleteEmpresaById(Integer id) {
        empresaRepository.deleteById(id);
    }

    @Override
    public void deleteEmpresa(Empresa empresa) {
        empresaRepository.delete(empresa);
    }

    @Override
    public void updateEmpresaById(Integer id, Empresa empresa) {
        Optional<Empresa> getEmpresa = getEmpresaById(id);
        getEmpresa.get().setCnpj(empresa.getCnpj());
        getEmpresa.get().setRazaoSocial(empresa.getRazaoSocial());
        getEmpresa.get().setTelefone(empresa.getTelefone());
        getEmpresa.get().setEnderecoEmpresa(empresa.getEnderecoEmpresa());
        empresaRepository.save(empresa);
    }

    @Override
    public void updateEmpresa(Empresa empresa) {
        empresaRepository.save(empresa);
    }

    @Override
    public void insertEmpresa(Empresa empresa) {
        empresaRepository.save(empresa);
    }
}

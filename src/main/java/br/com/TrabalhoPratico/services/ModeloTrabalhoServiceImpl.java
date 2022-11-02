package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.ModeloTrabalhoRepository;
import models.Formacao;
import models.ModeloTrabalho;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("modeloTrabalhoService")
public class ModeloTrabalhoServiceImpl implements ModeloTrabalhoService {
    @Autowired
    ModeloTrabalhoRepository modeloTrabalhoRepository;

    @Override
    public Optional<ModeloTrabalho> getModeloTrabalhoById(Integer id) {
        return modeloTrabalhoRepository.findById(id);
    }

    @Override
    public List<ModeloTrabalho> getAllModeloTrabalho() {
        return modeloTrabalhoRepository.findAll();
    }

    @Override
    public void deleteAllModeloTrabalho() {
        modeloTrabalhoRepository.deleteAll();
    }

    @Override
    public void deleteModeloTrabalhoById(Integer id) {
        modeloTrabalhoRepository.deleteById(id);
    }

    @Override
    public void deleteModeloTrabalho(ModeloTrabalho modeloTrabalho) {
        modeloTrabalhoRepository.delete(modeloTrabalho);
    }

    @Override
    public void updateModeloTrabalhoById(Integer id, ModeloTrabalho modeloTrabalho) {
        Optional<ModeloTrabalho> getModeloT = getModeloTrabalhoById(id);
        modeloTrabalhoRepository.save(modeloTrabalho);
    }

    @Override
    public void updateModeloTrabalho(ModeloTrabalho modeloTrabalho) {
        modeloTrabalhoRepository.save(modeloTrabalho);
    }

    @Override
    public void insertModeloTrabalho(ModeloTrabalho modeloTrabalho) {
        modeloTrabalhoRepository.save(modeloTrabalho);
    }
}

package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.FormacaoRepository;
import models.Experiencia;
import models.Formacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service("formacaoService")
public class FormacaoServiceImpl implements FormacaoService{
    @Autowired
    FormacaoRepository formacaoRepository;

    @Override
    public Optional<Formacao> getFormacaoById(Integer id) {
        return formacaoRepository.findById(id);
    }

    @Override
    public List<Formacao> getAllFormacao() {
        return formacaoRepository.findAll();
    }

    @Override
    public void deleteAllFormacao() {
        formacaoRepository.deleteAll();
    }

    @Override
    public void deleteFormacaoById(Integer id) {
        formacaoRepository.deleteById(id);
    }

    @Override
    public void deleteFormacao(Formacao formacao) {
        formacaoRepository.delete(formacao);
    }

    @Override
    public void updateFormacaoById(Integer id, Formacao formacao) {
        Optional<Formacao> getFormacao = getFormacaoById(id);
        getFormacao.get().setArea(formacao.getArea());
        getFormacao.get().setNomeInstituicao(formacao.getNomeInstituicao());
        getFormacao.get().setCursandoAtualmente(formacao.getCursandoAtualmente());
        getFormacao.get().setDataInicio(formacao.getDataInicio());
        getFormacao.get().setDataFim(formacao.getDataFim());
        getFormacao.get().setGrauFormacao(formacao.getGrauFormacao());
        getFormacao.get().setDescricao(formacao.getDescricao());
        formacaoRepository.save(formacao);
    }

    @Override
    public void updateFormacao(Formacao formacao) {
        formacaoRepository.save(formacao);
    }

    @Override
    public void insertFormacao(Formacao formacao) {
        formacaoRepository.save(formacao);
    }
}

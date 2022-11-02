package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.EspecializacaoRepository;
import models.Endereco;
import models.Especializacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service("especializacaoService")
public class EspecializacaoServiceImpl implements EspecializacaoService {
    @Autowired
    EspecializacaoRepository especializacaoRepository;

    @Override
    public Optional<Especializacao> getEspecializacaoById(Integer id) {
        return especializacaoRepository.findById(id);
    }

    @Override
    public List<Especializacao> getAllEspecializacao() {
        return especializacaoRepository.findAll();
    }

    @Override
    public void deleteAllEspecializacao() {
        especializacaoRepository.deleteAll();
    }

    @Override
    public void deleteEspecializacaoById(Integer id) {
        especializacaoRepository.deleteById(id);
    }

    @Override
    public void deleteEspecializacao(Especializacao especializacao) {
        especializacaoRepository.delete(especializacao);
    }

    @Override
    public void updateEspecializacaoById(Integer id, Especializacao especializacao) {
        Optional<Especializacao> getEspecializacao = getEspecializacaoById(id);
        getEspecializacao.get().setNome(especializacao.getNome());
        getEspecializacao.get().setDataInicio(especializacao.getDataInicio());
        getEspecializacao.get().setDataFim(especializacao.getDataFim());
        getEspecializacao.get().setProficiencia(especializacao.getProficiencia());
        getEspecializacao.get().setDescricao(especializacao.getDescricao());
        especializacaoRepository.save(especializacao);
    }

    @Override
    public void updateEspecializacao(Especializacao especializacao) {
        especializacaoRepository.save(especializacao);
    }

    @Override
    public void insertEspecializacao(Especializacao especializacao) {
        especializacaoRepository.save(especializacao);
    }
}

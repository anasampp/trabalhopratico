package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.EnderecoRepository;
import br.com.TrabalhoPratico.models.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("enderecoService")
public class EnderecoServiceImpl implements EnderecoService {
    @Autowired
    EnderecoRepository enderecoRepository;

    @Override
    public Optional<Endereco> getEnderecoById(Integer id) {
        return enderecoRepository.findById(id);
    }

    @Override
    public List<Endereco> getAllEndereco() {
        return enderecoRepository.findAll();
    }

    @Override
    public void deleteAllEndereco() {
        enderecoRepository.deleteAll();
    }

    @Override
    public void deleteEnderecoById(Integer id) {
        enderecoRepository.deleteById(id);
    }

    @Override
    public void deleteEndereco(Endereco endereco) {
        enderecoRepository.delete(endereco);
    }

    @Override
    public void updateEnderecoById(Integer id, Endereco endereco) {
        Optional<Endereco> getEndereco = getEnderecoById(id);
        getEndereco.get().setEstado(endereco.getEstado());
        getEndereco.get().setCidade(endereco.getCidade());
        getEndereco.get().setRua(endereco.getRua());
        getEndereco.get().setBairro(endereco.getBairro());
        getEndereco.get().setCep(endereco.getCep());
        getEndereco.get().setNumero(endereco.getNumero());
        enderecoRepository.save(endereco);
    }

    @Override
    public void updateEndereco(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    @Override
    public void insertEndereco(Endereco endereco) {
        enderecoRepository.save(endereco);
    }
}

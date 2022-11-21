package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.models.Endereco;

import java.util.List;
import java.util.Optional;

public interface EnderecoService {
    Optional<Endereco> getEnderecoById(Integer id);
    List<Endereco> getAllEndereco();
    void deleteAllEndereco();
    void deleteEnderecoById(Integer id);
    void deleteEndereco(Endereco endereco);
    void updateEnderecoById(Integer id, Endereco endereco);
    void updateEndereco(Endereco endereco);
    void insertEndereco(Endereco endereco);
}

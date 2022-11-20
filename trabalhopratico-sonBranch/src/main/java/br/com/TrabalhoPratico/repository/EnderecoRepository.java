package br.com.TrabalhoPratico.repository;

import br.com.TrabalhoPratico.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("enderecoRepository")
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}

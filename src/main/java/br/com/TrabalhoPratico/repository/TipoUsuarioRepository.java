package br.com.TrabalhoPratico.repository;

import br.com.TrabalhoPratico.models.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tipoUsuarioRepository")
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer> {
}

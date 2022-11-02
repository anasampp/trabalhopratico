package br.com.TrabalhoPratico.repository;

import models.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("tipoUsuarioRepository")
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer> {
}

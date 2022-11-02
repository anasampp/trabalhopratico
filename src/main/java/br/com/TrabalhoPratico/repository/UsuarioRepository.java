package br.com.TrabalhoPratico.repository;

import models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}

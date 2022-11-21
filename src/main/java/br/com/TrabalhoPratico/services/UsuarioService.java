package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.models.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    Optional<Usuario> getUsuarioById(Integer id);
    List<Usuario> getAllUsuario();
    void deleteAllUsuario();
    void deleteUsuarioById(Integer id);
    void deleteUsuario(Usuario usuario);
    void updateUsuarioById(Integer id, Usuario usuario);
    void updateUsuario(Usuario usuario);
    void insertUsuario(Usuario usuario);
}

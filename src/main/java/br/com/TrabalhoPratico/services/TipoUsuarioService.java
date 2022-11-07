package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.models.TipoUsuario;

import java.util.List;
import java.util.Optional;

public interface TipoUsuarioService {
    Optional<TipoUsuario> getTipoUsuarioById(Integer id);
    List<TipoUsuario> getAllTipoUsuario();
    void deleteAllTipoUsuario();
    void deleteTipoUsuarioById(Integer id);
    void deleteTipoUsuario(TipoUsuario tipoUsuario);
    void updateTipoUsuarioById(Integer id, TipoUsuario tipoUsuario);
    void updateTipoUsuario(TipoUsuario tipoUsuario);
    void insertTipoUsuario(TipoUsuario tipoUsuario);
}

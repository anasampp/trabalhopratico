package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.TipoUsuarioRepository;
import br.com.TrabalhoPratico.models.TipoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("tipoUsuarioService")
public class TipoUsuarioServiceImpl implements TipoUsuarioService {
    @Autowired
    TipoUsuarioRepository tipoUsuarioRepository;

    @Override
    public Optional<TipoUsuario> getTipoUsuarioById(Integer id) {
        return tipoUsuarioRepository.findById(id);
    }

    @Override
    public List<TipoUsuario> getAllTipoUsuario() {
        return tipoUsuarioRepository.findAll();
    }

    @Override
    public void deleteAllTipoUsuario() {
        tipoUsuarioRepository.deleteAll();
    }

    @Override
    public void deleteTipoUsuarioById(Integer id) {
        tipoUsuarioRepository.deleteById(id);
    }

    @Override
    public void deleteTipoUsuario(TipoUsuario tipoUsuario) {
        tipoUsuarioRepository.delete(tipoUsuario);
    }

    @Override
    public void updateTipoUsuarioById(Integer id, TipoUsuario tipoUsuario) {
        Optional<TipoUsuario> getTipoUsuario = getTipoUsuarioById(id);
        tipoUsuarioRepository.save(tipoUsuario);
    }

    @Override
    public void updateTipoUsuario(TipoUsuario tipoUsuario) {
        tipoUsuarioRepository.save(tipoUsuario);
    }

    @Override
    public void insertTipoUsuario(TipoUsuario tipoUsuario) {
        tipoUsuarioRepository.save(tipoUsuario);
    }
}

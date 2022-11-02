package br.com.TrabalhoPratico.services;

import br.com.TrabalhoPratico.repository.UsuarioRepository;
import models.TipoVaga;
import models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public Optional<Usuario> getUsuarioById(Integer id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public List<Usuario> getAllUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public void deleteAllUsuario() {
        usuarioRepository.deleteAll();
    }

    @Override
    public void deleteUsuarioById(Integer id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }

    @Override
    public void updateUsuarioById(Integer id, Usuario usuario) {
        Optional<Usuario> getUsuario = getUsuarioById(id);
        getUsuario.get().setNome(usuario.getNome());
        getUsuario.get().setEmail(usuario.getEmail());
        getUsuario.get().setSenha(usuario.getSenha());
        getUsuario.get().setTipoUsuario(usuario.getTipoUsuario());
        usuarioRepository.save(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public void insertUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}

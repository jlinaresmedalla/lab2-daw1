package com.hotelmanagement.daw_jlinares.service;

import com.hotelmanagement.daw_jlinares.model.Usuario;
import com.hotelmanagement.daw_jlinares.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    public List<Usuario> listarUsuarios() {
        return iUsuarioRepository.findAll();
    }

    public Usuario grabarUsuario(Usuario usuario) {
        return iUsuarioRepository.save(usuario);
    }

    public Usuario validarUsuario(Usuario usuario) {
        return iUsuarioRepository.findByCorreoAndClave(usuario.getCorreo(), usuario.getClave());
    }
}

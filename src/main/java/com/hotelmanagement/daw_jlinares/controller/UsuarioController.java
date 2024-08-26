package com.hotelmanagement.daw_jlinares.controller;

import com.hotelmanagement.daw_jlinares.model.Usuario;
import com.hotelmanagement.daw_jlinares.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @PostMapping("/grabar")
    public ResponseEntity<Usuario> grabarUsuario(@RequestBody Usuario usuario) {
        Usuario nuevo = usuarioService.grabarUsuario(usuario);
        return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
    }

    @PostMapping("/validar")
    public ResponseEntity<Usuario> validarUsuario(@RequestBody Usuario usuario) {
        Usuario nuevo = usuarioService.validarUsuario(usuario);
        return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
    }
}

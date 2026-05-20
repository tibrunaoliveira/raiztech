package com.raiztech.raiztech_api.controller;

import com.raiztech.raiztech_api.entity.Usuario;
import com.raiztech.raiztech_api.repository.UsuarioRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }

    @PostMapping
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }
}

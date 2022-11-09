package com.riseup.riseup_backend.controller;

import com.riseup.riseup_backend.model.Usuario;
import com.riseup.riseup_backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://127.0.0.1:5173")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Adicionar um novo Usuário
    @PostMapping("/usuario")
    Usuario newUsuario(@RequestBody Usuario newUsuario) {
        return usuarioRepository.save(newUsuario);
    }

    // Retorna todos os usuários cadastrados
    @GetMapping("/usuarios")
    List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    // Retorna um usuário pelo id
    @GetMapping("usuario/{id}")
    Optional<Usuario> getUsuarioById(@PathVariable Long id) {
        return usuarioRepository.findById(id);
    }


}

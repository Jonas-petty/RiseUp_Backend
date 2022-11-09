package com.riseup.riseup_backend.controller;

import com.riseup.riseup_backend.exception.UsuarioNotFoundException;
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
    Usuario getUsuarioById(@PathVariable Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new UsuarioNotFoundException(id));
    }

    // Altera um usuário pelo id
    @PutMapping("usuario/{id}")
    Usuario updateUsuario(@RequestBody Usuario newUsuario, @PathVariable Long id) {
        return usuarioRepository.findById(id)
                .map(usuario -> {
                    usuario.setNome(newUsuario.getNome());
                    usuario.setEmail(newUsuario.getEmail());
                    usuario.setSenha(newUsuario.getSenha());
                    return usuarioRepository.save(usuario);
                }).orElseThrow(() -> new UsuarioNotFoundException(id));
    }

    // Deleta um usuário pelo id
    @DeleteMapping("usuario/{id}")
    String deleteUsuario(@PathVariable Long id) {
        if (!usuarioRepository.existsById(id)) {
            throw new UsuarioNotFoundException(id);
        } else {
            usuarioRepository.deleteById(id);
            return "Usuário com id " + id + " foi deletado";
        }

    }
}

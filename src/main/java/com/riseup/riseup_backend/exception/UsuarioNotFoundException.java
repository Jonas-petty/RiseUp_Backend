package com.riseup.riseup_backend.exception;

public class UsuarioNotFoundException extends RuntimeException {

    public UsuarioNotFoundException(Long id) {
        super("Não foi possível encontrar o Usuário com id " + id);
    }
}

package com.sis_autentificacao_jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/protected")
public class ProtectedController {

    @GetMapping
    public ResponseEntity<String> secured() {
        return ResponseEntity.ok("Acesso permitido! Token JWT válido.");
    }
}

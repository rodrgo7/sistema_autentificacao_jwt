package com.sis_autentificacao_jwt.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String username;
    private String email;
    private String password;
}

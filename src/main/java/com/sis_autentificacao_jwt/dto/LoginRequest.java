package com.sis_autentificacao_jwt.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}

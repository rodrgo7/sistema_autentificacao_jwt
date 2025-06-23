package com.sis_autentificacao_jwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/auth/**").permitAll() // libera login e registro
                        .anyRequest().authenticated()
                )
                .formLogin(login -> login.disable()) // desativa formulário padrão
                .httpBasic(basic -> basic.disable()); // desativa autenticação básica

        return http.build();
    }
}

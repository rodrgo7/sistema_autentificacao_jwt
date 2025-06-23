package com.sis_autentificacao_jwt.repository;

import com.sis_autentificacao_jwt.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByEmail(String email);
}

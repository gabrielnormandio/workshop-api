package com.workshop.curso.controller;

import com.workshop.curso.model.User;
import com.workshop.curso.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User("Gabriel", "gaab@gmail.com", "(99)999999999", "password");
        return ResponseEntity.ok().body(user);
    }

}

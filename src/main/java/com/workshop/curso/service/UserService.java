package com.workshop.curso.service;

import com.workshop.curso.model.User;
import com.workshop.curso.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> listarUsers() {
        return repository.findAll();
    }

    public User buscarPorId(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
}

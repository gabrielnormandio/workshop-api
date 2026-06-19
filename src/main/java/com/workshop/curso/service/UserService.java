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
    public User addUser(User user) {
        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User update(Long id, User user) {
        Optional<User> obj = repository.findById(id);
        obj.get().setName(user.getName());
        obj.get().setEmail(user.getEmail());
        obj.get().setPhone(user.getPhone());

        return repository.save(obj.get());
    }

    public User delete(Long id) {
        Optional<User> obj = repository.findById(id);
        obj.ifPresent(repository::delete);

        return obj.get();
    }
}

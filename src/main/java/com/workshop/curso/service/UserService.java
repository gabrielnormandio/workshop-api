package com.workshop.curso.service;

import com.workshop.curso.model.User;
import com.workshop.curso.repository.UserRepository;
import com.workshop.curso.service.exception.DatabaseException;
import com.workshop.curso.service.exception.ResourceNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }
    public User insertUser(User user) {
        return repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User update(Long id, User user) {
        Optional<User> obj = repository.findById(id);
        obj.get().setName(user.getName());
        obj.get().setEmail(user.getEmail());
        obj.get().setPhone(user.getPhone());

        return repository.save(obj.get());
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(e.getMessage());
        }
    }
}

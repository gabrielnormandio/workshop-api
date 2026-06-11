package com.workshop.curso.service;

import com.workshop.curso.model.Order;
import com.workshop.curso.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> listarOrders() {
        return repository.findAll();
    }

    public Order buscarPorId(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}

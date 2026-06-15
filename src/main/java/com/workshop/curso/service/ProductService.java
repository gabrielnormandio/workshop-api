package com.workshop.curso.service;

import com.workshop.curso.model.Product;
import com.workshop.curso.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository ProductRepository;

    public ProductService(ProductRepository ProductRepository) {
        this.ProductRepository = ProductRepository;
    }

    public List<Product> findAll() {
        return ProductRepository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = ProductRepository.findById(id);
        return obj.get();
    }
}

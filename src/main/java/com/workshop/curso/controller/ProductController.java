package com.workshop.curso.controller;

import com.workshop.curso.model.Product;
import com.workshop.curso.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService ProductService;

    public ProductController(ProductService ProductService) {
        this.ProductService = ProductService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = ProductService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = ProductService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

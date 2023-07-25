package com.example.springbootdao.controller;

import com.example.springbootdao.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/products/fetch-product")
    public String fetchProduct(String name) {
        return repository.getProductName(name);
    }
}
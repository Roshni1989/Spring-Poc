package com.ecom.prd.entity.controller;

import com.ecom.prd.entity.entity.Product;
import org.springframework.web.bind.annotation.*;
import com.ecom.prd.entity.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    List<Product> getAllProducts() {
        return productRepository.findAll();
    }


    @GetMapping("/{pid}")
    Optional<Product> getProductbyId(@PathVariable int pid){
       return productRepository.findById(pid);
    }

    @PostMapping("/")
    Product createProduct(@RequestBody Product product){
        return productRepository.save(product);
    }

    @DeleteMapping("/{pid}")
    void deleteProductById(@PathVariable int pid){
        productRepository.deleteById(pid);
    }


    @GetMapping("/name/{productName}")
    Product getProductByName(@PathVariable String productName){
        return productRepository.getByProductName(productName).get();
    }

}

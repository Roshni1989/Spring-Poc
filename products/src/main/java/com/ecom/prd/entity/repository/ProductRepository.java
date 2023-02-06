package com.ecom.prd.entity.repository;

import com.ecom.prd.entity.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    public Optional<Product> getByProductName(String productName);


}

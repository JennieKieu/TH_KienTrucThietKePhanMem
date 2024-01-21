package com.fit.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fit.demo.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

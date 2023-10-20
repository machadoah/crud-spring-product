package com.medium.machadoah.crudtutorial.repository;

import com.medium.machadoah.crudtutorial.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findAllByActiveTrue();
}

package com.medium.machadoah.crudtutorial.controller;

import com.medium.machadoah.crudtutorial.domain.product.Product;
import com.medium.machadoah.crudtutorial.dto.RequestProductDTO;
import com.medium.machadoah.crudtutorial.dto.UpdateProductDTO;
import com.medium.machadoah.crudtutorial.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity getAllProducts(){
        var allProducts = repository.findAllByActiveTrue();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProductDTO data){
        Product newProduct = new Product(data);
        repository.save(newProduct);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateProduct(@RequestBody @Valid UpdateProductDTO data){
        Optional<Product> optionalProduct = repository.findById(data.id());
        if (optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            product.setName(data.name());
            product.setPrice_in_cents(data.price_in_cents());
            return ResponseEntity.ok(product);
        } else {
            throw new EntityNotFoundException();
        }
    }

    @DeleteMapping(path = "/{id}")
    @Transactional
    public ResponseEntity deleteProduct(@PathVariable String id){
        Optional<Product> optionalProduct = repository.findById(id);
        if (optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            product.setActive(false);
            return ResponseEntity.noContent().build();
        } else {
            throw new EntityNotFoundException();
        }
    }

}

package com.medium.machadoah.crudtutorial.controller;

import com.medium.machadoah.crudtutorial.domain.product.Product;
import com.medium.machadoah.crudtutorial.dto.RequestProductDTO;
import com.medium.machadoah.crudtutorial.dto.ProductDTO;
import com.medium.machadoah.crudtutorial.repository.ProductRepository;

import com.medium.machadoah.crudtutorial.service.ProductService;
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
    private ProductService productService;

    @GetMapping
    public ResponseEntity getAllProducts(){
        return ResponseEntity.ok(productService.findAll());
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody @Valid RequestProductDTO data){
        return ResponseEntity.ok(productService.save(data));
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateProduct(@RequestBody @Valid ProductDTO data){
        return ResponseEntity.ok(productService.update(data));
    }

    @DeleteMapping(path = "/{id}")
    @Transactional
    public ResponseEntity deleteProduct(@PathVariable String id){
        return ResponseEntity.ok(productService.delete(id));
    }

}

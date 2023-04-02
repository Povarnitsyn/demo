package com.example.demo.services;

import com.example.demo.entities.Product;
//import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<Product, Integer> {

}


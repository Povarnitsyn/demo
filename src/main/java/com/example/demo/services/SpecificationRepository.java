package com.example.demo.services;

import com.example.demo.entities.Specifications;
import org.springframework.data.repository.CrudRepository;



public interface SpecificationRepository extends CrudRepository<Specifications, Integer> {

}
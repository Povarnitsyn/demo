package com.example.demo.services;

import com.example.demo.entities.Specification;
import org.springframework.data.repository.CrudRepository;



public interface SpecificationRepository extends CrudRepository<Specification, Integer> {

}
package services;

import entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductServices extends CrudRepository<Product, Integer> {

}

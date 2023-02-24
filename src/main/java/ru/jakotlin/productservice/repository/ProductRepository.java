package ru.jakotlin.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import ru.jakotlin.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}

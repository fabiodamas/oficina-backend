package io.github.fabiodamas.oficinabackend.repositories;

import io.github.fabiodamas.oficinabackend.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    long countByIdIsNotNull();
}
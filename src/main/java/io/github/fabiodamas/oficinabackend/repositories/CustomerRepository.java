package io.github.fabiodamas.oficinabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fabiodamas.oficinabackend.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}

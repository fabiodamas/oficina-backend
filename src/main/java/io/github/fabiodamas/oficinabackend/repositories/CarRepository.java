package io.github.fabiodamas.oficinabackend.repositories;

import io.github.fabiodamas.oficinabackend.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
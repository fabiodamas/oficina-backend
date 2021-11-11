package io.github.fabiodamas.oficinabackend.repositories;

import io.github.fabiodamas.oficinabackend.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
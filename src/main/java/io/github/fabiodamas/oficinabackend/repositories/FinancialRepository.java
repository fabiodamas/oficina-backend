package io.github.fabiodamas.oficinabackend.repositories;

import io.github.fabiodamas.oficinabackend.domain.Financial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialRepository extends JpaRepository<Financial, Long> {
}
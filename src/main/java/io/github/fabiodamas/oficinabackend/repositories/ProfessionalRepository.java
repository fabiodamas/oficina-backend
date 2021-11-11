package io.github.fabiodamas.oficinabackend.repositories;

import io.github.fabiodamas.oficinabackend.domain.Professional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionalRepository extends JpaRepository<Professional, Long> {
}
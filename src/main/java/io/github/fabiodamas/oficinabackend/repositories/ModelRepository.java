package io.github.fabiodamas.oficinabackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.fabiodamas.oficinabackend.domain.Model;

public interface ModelRepository extends JpaRepository<Model, Long> {
}
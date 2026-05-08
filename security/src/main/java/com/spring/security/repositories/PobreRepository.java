package com.spring.security.repositories;

import com.spring.security.models.PobreModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PobreRepository extends JpaRepository<PobreModel, Long> {
}

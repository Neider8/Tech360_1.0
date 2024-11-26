package com.telas.tech360.repository;

import com.telas.tech360.model.MateriaPrima;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaPrimaRepository extends JpaRepository<MateriaPrima, Integer> {
}
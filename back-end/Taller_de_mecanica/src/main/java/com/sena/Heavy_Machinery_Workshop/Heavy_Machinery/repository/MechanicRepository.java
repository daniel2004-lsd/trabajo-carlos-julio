package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Mechanic;

@Repository
public interface MechanicRepository extends JpaRepository<Mechanic, Integer> {
    // You can add custom methods here if needed
}

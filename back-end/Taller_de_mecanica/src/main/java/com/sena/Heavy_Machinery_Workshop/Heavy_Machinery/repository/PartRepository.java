package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.servlet.http.Part;

@Repository
public interface PartRepository extends JpaRepository<Part, Integer> {
    // You can add custom methods here if needed
}

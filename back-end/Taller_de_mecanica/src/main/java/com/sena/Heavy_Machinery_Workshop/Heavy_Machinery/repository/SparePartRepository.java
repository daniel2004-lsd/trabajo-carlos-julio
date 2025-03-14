package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.SparePart;

import jakarta.servlet.http.Part;

@Repository
public interface SparePartRepository extends JpaRepository<Part, Integer> {

    Optional<SparePart> findById(Long id);
    // You can add custom methods here if needed

    SparePart save(SparePart sparePart);
}

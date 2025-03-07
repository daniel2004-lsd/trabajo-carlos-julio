package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
    // You can add custom methods here if needed
}

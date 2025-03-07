package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicePartRepository extends JpaRepository<ServicePart, Integer> {
    // You can add custom methods here if needed
}

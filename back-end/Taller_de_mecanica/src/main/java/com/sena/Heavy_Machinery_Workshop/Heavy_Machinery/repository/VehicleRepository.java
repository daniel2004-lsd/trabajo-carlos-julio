package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    // You can add custom methods here if needed
}

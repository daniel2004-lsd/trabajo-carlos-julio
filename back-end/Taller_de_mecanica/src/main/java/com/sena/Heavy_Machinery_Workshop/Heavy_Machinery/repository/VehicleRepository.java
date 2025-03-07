package com.sena.Heavy_Machinery_Workshop.Taller_de_mecanica.repository;

import com.sena.Heavy_Machinery_Workshop.Taller_de_mecanica.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    // You can add custom methods here if needed
}

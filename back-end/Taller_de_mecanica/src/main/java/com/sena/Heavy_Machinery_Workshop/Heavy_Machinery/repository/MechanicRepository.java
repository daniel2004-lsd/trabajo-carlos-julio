package com.sena.Heavy_Machinery_Workshop.Taller_de_mecanica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicRepository extends JpaRepository<Mechanic, Integer> {
    // You can add custom methods here if needed
}

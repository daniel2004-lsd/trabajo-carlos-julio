package com.sena.Heavy_Machinery_Workshop.Taller_de_mecanica.repository;

import com.sena.Heavy_Machinery_Workshop.Taller_de_mecanica.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
    // You can add custom methods here if needed
}

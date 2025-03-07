package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ch.qos.logback.core.net.server.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Client save(
            com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model.Client client);
    // You can add custom methods here if needed
}

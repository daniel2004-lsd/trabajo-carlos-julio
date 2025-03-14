package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import ch.qos.logback.core.net.server.Client;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity(name = "services")
public class ServiceService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_services")
    private int id;

    @Column(name = "service_description")
    private String serviceDescription;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    // Otros atributos y métodos

    public ServiceService() {}

    public ServiceService(String serviceDescription, Client client) {
        this.serviceDescription = serviceDescription;
        this.client = client;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity(name = "service")  // Changed "servicio" to "service" (English name)
public class Service {  // Changed class name from "servicio" to "Service" (CamelCase)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "description")  // Changed "descripcion" to "description"
    private String description;

    @Column(name = "date")  // Changed "fecha" to "date"
    private Date date;

    @Column(name = "cost")  // Changed "costo" to "cost"
    private int cost;

    @OneToMany
    @JoinColumn(name = "id_vehicle", nullable = false)  // Changed "id_vehiculo" to "id_vehicle"
    private Client client;  // Changed "clientes" to "Client" (the class name for clients)

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}

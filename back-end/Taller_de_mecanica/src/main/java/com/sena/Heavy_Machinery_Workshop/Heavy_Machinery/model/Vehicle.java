package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity(name = "vehicles")  // Changed "vehiculos" to "vehicles" (English naming)
public class Vehicle {  // Changed class name from "vehiculos" to "Vehicle" (CamelCase)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehicles")  // Changed "id_vehiculos" to "id_vehicles"
    private int id;

    @Column(name = "brand")  // Changed "marca" to "brand"
    private String brand;

    @Column(name = "model")  // Changed "modelo" to "model"
    private String model;

    @Column(name = "license_plate")  // Changed "matricula" to "license_plate"
    private String licensePlate;

    @Column(name = "year")  // Changed "ano" to "year"
    private int year;

    // One-to-Many relationship: A client can have multiple vehicles
    @OneToMany
    @JoinColumn(name = "id_clients", nullable = false)  // Changed "id_clientes" to "id_clients"
    private Client client;  // Changed "clientes" to "Client" class

    public Vehicle() {}  // Empty constructor

    public Vehicle(String brand, String model, String licensePlate, int year) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.year = year;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

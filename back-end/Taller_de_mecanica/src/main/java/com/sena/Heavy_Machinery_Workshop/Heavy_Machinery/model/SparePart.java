package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;
import java.util.List;

@Entity
@Table(name = "sparePart")
public class SparePart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sparePart_id")
    private long sparePartId;

    @Column(nullable = false)
    private String name; // Nombre del repuesto

    @Column(nullable = false)
    private String brand; // Marca del repuesto

    @Column(nullable = false)
    private double price; // Precio del repuesto

    // Relación con ServiceSparePart (un repuesto puede estar en varios servicios)
    @OneToMany(mappedBy = "sparePart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ServiceSparePart> serviceSpareParts;

    // Constructor vacío
    public SparePart() {
    }

    // Constructor con parámetros
    public SparePart(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    // Getters y Setters
    public Long getSparePartId() {
        return sparePartId;
    }

    public void setSparePartId(Long sparePartId) {
        this.sparePartId = sparePartId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

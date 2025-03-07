package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import java.util.List;
@Entity(name = "ServiceSparePart")
public class ServiceSparePart {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;

    @Id
    @ManyToOne
    @JoinColumn(name = "spare_part_id", nullable = false)
    private SparePart sparePart;

    @Column(nullable = false)
    private int quantity; // Por si necesitas la cantidad de repuestos usados en el servicio

    // Constructor vacío
    public ServiceSparePart() {
    }

    // Constructor con parámetros
    public ServiceSparePart(Service service, SparePart sparePart, int quantity) {
        this.service = service;
        this.sparePart = sparePart;
        this.quantity = quantity;
    }

    // Getters y Setters
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public SparePart getSparePart() {
        return sparePart;
    }

    public void setSparePart(SparePart sparePart) {
        this.sparePart = sparePart;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import java.util.List;

@Entity(name = "clients")  // Changed "clientes" to "clients" (English naming)
public class Client {  // Changed class name from "clientes" to "Client" (CamelCase)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clients")  // Changed "id_clientes" to "id_clients"
    private int id;

    @Column(name = "name")  // Changed "nombre" to "name"
    private String name;

    @Column(name = "address")  // Changed "direccion" to "address"
    private String address;

    @Column(name = "email")  // Changed "gmail" to "email"
    private String email;

    @Column(name = "phone")  // Changed "telefono" to "phone"
    private String phone;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)  // cascade = CascadeType.ALL → If you delete a client, their vehicles are also deleted.
                                                                                         // orphanRemoval = true → If a vehicle is no longer associated with a client, it is automatically deleted.
    private List<Vehicle> vehicles;  // Changed "vehiculos" to "vehicles"

    public Client() {}  // Empty constructor

    public Client(String name, String address, String email, String phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

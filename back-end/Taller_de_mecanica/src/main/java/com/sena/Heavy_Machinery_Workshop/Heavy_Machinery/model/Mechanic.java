package com.sena.Heavy_Machinery_Workshop.Heavy_Machinery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;


@Entity(name = "Mechanic")
public class Mechanic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mechanic")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "specialty")
    private String specialty;

    @Column(name = "phone")
    private String phone;

    public Mechanic() {
    }

    public Mechanic(String name, String specialty, String phone) {
        this.name = name;
        this.specialty = specialty;
        this.phone = phone;
    };

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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
package com.sena.Taller_de_mecanica_pesada.Taller_de_mecanica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.CascadeType;
import java.util.List;

@Entity(name = "clientes")
public class clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clientes")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "gmail")
    private String gmail;

    @Column(name = "telefono")
    private String telefono;
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true) // cascade = CascadeType.ALL → Si
                                                                                      // eliminas un cliente, también se
                                                                                      // eliminan sus vehículos. 🔹
                                                                                      // orphanRemoval = true → Si un
                                                                                      // vehículo ya no está asociado a
                                                                                      // un cliente, se elimina
                                                                                      // automáticamente.

    private List<vehiculos> vehiculos;

    public clientes() {
    }

    public clientes(String nombre, String direccion, String gmail, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.gmail = gmail;
        this.telefono = telefono;
    };

    public int getid() {
        return id;
    };

    public void setid(int id) {
        this.id = id;
    };

    public String nombre() {
        return nombre;
    };

    public void nombre(String nombre) {
        this.nombre = nombre;
    };

    public String direccion() {
        return direccion;
    };

    public void direccion(String direccion) {
        this.direccion = direccion;
    };

    public String gmail() {
        return gmail;
    };

    public void gmail(String gmail) {
        this.gmail = gmail;
    };

    public String telefono() {
        return telefono;
    };

    public void telefono(String telefono) {
        this.telefono = telefono;
    };
};

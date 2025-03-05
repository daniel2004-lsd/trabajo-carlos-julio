package com.sena.Taller_de_mecanica_pesada.Taller_de_mecanica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.CascadeType;

 @Entity(name="clientes")
public class clientes {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_clientes")
    private int id;

    @Column(name="nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "gmail")
    private String gmail;

    @Column(name = "telefono")
    private String telefono;
}

    
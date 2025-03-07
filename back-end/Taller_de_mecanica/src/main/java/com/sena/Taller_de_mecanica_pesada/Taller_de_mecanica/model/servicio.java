package com.sena.Taller_de_mecanica_pesada.Taller_de_mecanica.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity (name = "servicio")
public class servicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "costo")
    private int costo;

    @OneToMany
    @JoinColumn(name = "id_vehiculo", nullable = false)
    private clientes cliente;
}

package com.sena.Taller_de_mecanica_pesada.Taller_de_mecanica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity(name = "vehiculos")
public class vehiculos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // "Encárgate tú del ID, empieza en 1 y sigue aumentando
                                                        // automáticamente cada vez que agregue un nuevo dato."
    @Column(name = "id_vehiculos")
    private int id;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "matricula")
    private String matricula;

    @Column(name = "ano")
    private int ano;

    // Relación OneToMany: Un cliente puede tener varios vehículos
    @OneToMany
    @JoinColumn(name = "id_clientes", nullable = false) // llave foreana en la tabla de vehiculos asi se hace
                                                        // @JoinColumn(name = "id_cliente") → Indica que en la tabla
                                                        // vehiculos, la columna id_cliente almacenará la clave foránea
                                                        // que referencia la tabla clientes.🔹 nullable = false → Indica
                                                        // que esta columna no puede ser nula, es decir, un vehículo
                                                        // siempre debe tener un cliente.
    private clientes cliente;

    public vehiculos() {
    }; // constructor vacio

    public vehiculos(String marca, String modelo, String matricula, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.ano = ano;
    }

    public int getid() {
        return id;
    };

    public void setid(int id) {
        this.id = id;
    };

    public String getmarca() {
        return marca;
    };

    public void setmarca(String marca) {
        this.marca = marca;
    };

    public String getmodelo() {
        return modelo;
    };

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    };

    public String getmatricula() {
        return matricula;
    };

    public void setmatricula(String matricula) {
        this.matricula = matricula;
    };

    public int getano() {
        return ano;
    };

    public void setano(int ano) {
        this.ano = ano;
    };
};

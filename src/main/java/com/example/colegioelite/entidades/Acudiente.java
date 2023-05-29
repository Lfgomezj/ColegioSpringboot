package com.example.colegioelite.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="acudientes")
public class Acudiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nombres",nullable = false, length =50 )
    private String nombre;

    @Column(name="telefono",nullable = false, length =20 )
    private String telefono;

    @OneToOne
    @JoinColumn(name="id_estudiante")
    private Estudiante estudiante;

    public Acudiente() {
    }

    public Acudiente(Integer id, String nombre, String telefono, Estudiante estudiante) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.estudiante = estudiante;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}

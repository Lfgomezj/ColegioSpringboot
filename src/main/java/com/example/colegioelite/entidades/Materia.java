package com.example.colegioelite.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="materias")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nombre",nullable = false, length =50 )
    private String nombre;

    @Column(name="numerocreditos",nullable = false)
    private Integer numeroCreditos;

    @ManyToOne
    @JoinColumn(name="id_profesor")
    private Profesor profesor;

    public Materia() {
    }

    public Materia(Integer id, String nombre, Integer numeroCreditos, Profesor profesor) {
        this.id = id;
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.profesor = profesor;
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

    public Integer getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(Integer numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}

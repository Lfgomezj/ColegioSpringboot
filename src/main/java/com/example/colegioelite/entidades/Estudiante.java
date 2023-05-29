package com.example.colegioelite.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nombres",nullable = false, length =50 )
    private String nombre;

    @Column(name="documento",nullable = false, length =50 )
    private String documento;

    @Column(name="correo",nullable = false, length =50 )
    private String correo;


    @OneToOne(mappedBy = "estudiante", cascade = CascadeType.ALL)
    private Acudiente acudiente;


    public Estudiante() {
    }

    public Estudiante(Integer id, String nombre, String documento, String correo, Acudiente acudiente) {
        this.id = id;
        this.nombre = nombre;
        this.documento = documento;
        this.correo = correo;
        this.acudiente = acudiente;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Acudiente getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(Acudiente acudiente) {
        this.acudiente = acudiente;
    }
}

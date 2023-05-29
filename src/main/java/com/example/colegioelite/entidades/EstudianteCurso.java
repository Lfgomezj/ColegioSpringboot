package com.example.colegioelite.entidades;

import jakarta.persistence.*;

@Entity
@Table(name="estudiantecurso")
public class EstudianteCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="id_estudiante")
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name="id_materia")
    private Materia materia;

    public EstudianteCurso() {
    }

    public EstudianteCurso(Integer id, Estudiante estudiante, Materia materia) {
        this.id = id;
        this.estudiante = estudiante;
        this.materia = materia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}

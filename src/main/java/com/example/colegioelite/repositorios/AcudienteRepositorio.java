package com.example.colegioelite.repositorios;

import com.example.colegioelite.entidades.Acudiente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcudienteRepositorio extends JpaRepository<Acudiente,Integer> {
}

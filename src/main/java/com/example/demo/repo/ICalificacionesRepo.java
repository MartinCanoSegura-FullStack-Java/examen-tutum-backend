package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Calificaciones;

public interface ICalificacionesRepo extends JpaRepository<Calificaciones, Integer> {
	
	
}

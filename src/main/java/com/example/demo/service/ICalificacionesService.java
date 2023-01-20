package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Calificaciones;

public interface ICalificacionesService {

	Calificaciones registrar(Calificaciones c);
	Calificaciones modificar(Calificaciones c);
	List<Calificaciones> listar();
	Calificaciones listarPorId(Integer id);
	void eliminar(Integer id);
	
}

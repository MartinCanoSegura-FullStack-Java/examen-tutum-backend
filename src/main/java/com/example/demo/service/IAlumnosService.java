package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Alumnos;

public interface IAlumnosService {
	
	Alumnos registrar(Alumnos a);
	Alumnos modificar(Alumnos a);
	List<Alumnos> listar();
	Alumnos listarPorId(Integer id);
	void eliminar(Integer id);

}

package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Materias;

public interface IMateriasService {
	
	Materias registrar(Materias m);
	Materias modificar(Materias m);
	List<Materias> listar();
	Materias listarPorId(Integer id);
	void eliminar(Integer id);

}

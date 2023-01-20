package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Alumnos;
import com.example.demo.repo.IAlumnosRepo;
import com.example.demo.service.IAlumnosService;

@Service
public class AlumnosServiceImpl implements IAlumnosService {

	@Autowired
	private IAlumnosRepo repo;

	@Override
	public Alumnos registrar(Alumnos a) {
		return repo.save(a);
	}

	@Override
	public Alumnos modificar(Alumnos a) {
		return repo.save(a);
	}

	@Override
	public List<Alumnos> listar() {
		return repo.findAll();
	}

	@Override
	public Alumnos listarPorId(Integer id) {
		Optional<Alumnos> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Alumnos();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
	
	

}

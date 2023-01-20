package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Calificaciones;
import com.example.demo.repo.ICalificacionesRepo;
import com.example.demo.service.ICalificacionesService;

@Service
public class CalificacionesServiceImpl implements ICalificacionesService {

	@Autowired
	private ICalificacionesRepo repo;
	
	@Override
	public Calificaciones registrar(Calificaciones c) {
		return repo.save(c);
	}

	@Override
	public Calificaciones modificar(Calificaciones c) {
		return repo.save(c);
	}

	@Override
	public List<Calificaciones> listar() {
		return repo.findAll();
	}

	@Override
	public Calificaciones listarPorId(Integer id) {
		Optional<Calificaciones> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Calificaciones(); 
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
		
	}

}

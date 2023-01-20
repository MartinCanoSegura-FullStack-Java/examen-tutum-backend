package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Materias;
import com.example.demo.repo.IMateriasRepo;
import com.example.demo.service.IMateriasService;

@Service
public class MateriasServiceImpl implements IMateriasService {

	@Autowired
	private IMateriasRepo repo;
	
	@Override
	public Materias registrar(Materias m) {
		return repo.save(m);
	}

	@Override
	public Materias modificar(Materias m) {
		return repo.save(m);
	}

	@Override
	public List<Materias> listar() {
		return repo.findAll();
	}

	@Override
	public Materias listarPorId(Integer id) {
		Optional<Materias> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Materias();
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
	
	

}

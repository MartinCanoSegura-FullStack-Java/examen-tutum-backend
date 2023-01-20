package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Materias;
import com.example.demo.service.IMateriasService;

@RestController
@RequestMapping("/materias")
public class MateriasController {
	
Logger loger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IMateriasService service;
	
	@GetMapping
	public ResponseEntity<List<Materias>> listar() throws Exception {
		List<Materias> lista = service.listar();
		return new ResponseEntity<List<Materias>>(lista, HttpStatus.OK);
 	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Materias> listarById(@PathVariable("id") Integer id) throws Exception { 
		Materias obj = service.listarPorId(id);
	  return new ResponseEntity<Materias>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Materias> registrar(@RequestBody Materias materia) throws Exception { 
		Materias obj = service.registrar(materia);
	  return new ResponseEntity<Materias>(obj, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Materias> modificar(@RequestBody Materias materia) throws Exception { 
		Materias obj = service.modificar(materia);
	  return new ResponseEntity<Materias>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}") 
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception { 
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}

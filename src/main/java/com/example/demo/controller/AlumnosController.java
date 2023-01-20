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

import com.example.demo.model.Alumnos;
import com.example.demo.service.IAlumnosService;

@RestController
@RequestMapping("/alumnos")
public class AlumnosController {
	
	Logger loger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private IAlumnosService service;
	
	@GetMapping
	public ResponseEntity<List<Alumnos>> listar() throws Exception {
		List<Alumnos> lista = service.listar();
		return new ResponseEntity<List<Alumnos>>(lista, HttpStatus.OK);
 	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Alumnos> listarById(@PathVariable("id") Integer id) throws Exception { 
		Alumnos obj = service.listarPorId(id);
	  return new ResponseEntity<Alumnos>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Alumnos> registrar(@RequestBody Alumnos alumno) throws Exception { 
		Alumnos obj = service.registrar(alumno);
	  return new ResponseEntity<Alumnos>(obj, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Alumnos> modificar(@RequestBody Alumnos alumno) throws Exception { 
		Alumnos obj = service.modificar(alumno);
	  return new ResponseEntity<Alumnos>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}") ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
		System.out.println("**************ID: " + id);
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}

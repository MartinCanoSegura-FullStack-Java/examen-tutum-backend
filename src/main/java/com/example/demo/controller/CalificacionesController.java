package com.example.demo.controller;

import java.util.List;

import org.jfree.util.Log;
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

import com.example.demo.model.Calificaciones;
import com.example.demo.service.ICalificacionesService;

@RestController
@RequestMapping("/calificaciones")
public class CalificacionesController {

	Logger loger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ICalificacionesService service;

	@GetMapping
	public ResponseEntity<List<Calificaciones>> listar() throws Exception {
		List<Calificaciones> lista = service.listar();
		if(!lista.isEmpty()) {
			Log.error("No hay Calificacioens que mostrar...");
		}
		return new ResponseEntity<List<Calificaciones>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Calificaciones> listarById(@PathVariable("id") Integer id) throws Exception {
		Calificaciones obj = service.listarPorId(id);
		return new ResponseEntity<Calificaciones>(obj, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Calificaciones> registrar(@RequestBody Calificaciones c) throws Exception {
		Calificaciones obj = service.registrar(c);
		return new ResponseEntity<Calificaciones>(obj, HttpStatus.CREATED);
	}

	@PutMapping
	public ResponseEntity<Calificaciones> modificar(@RequestBody Calificaciones calificaciones) throws Exception {
		Calificaciones obj = service.modificar(calificaciones);
		return new ResponseEntity<Calificaciones>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception {
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}

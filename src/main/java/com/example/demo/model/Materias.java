package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "t_materias")
@Data
public class Materias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_materia;
	
	@Column(name = "nombre", nullable = false, length = 80)
	private String nombre;
	
	@Column(name = "activo", nullable = false)
	private int activo;

}

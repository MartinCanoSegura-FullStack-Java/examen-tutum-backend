package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "t_alumnos")
@Data
public class Alumnos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_alumno;
	
	@Column(name = "nombre", nullable = false, length = 80)
	private String nombre;
	
	@Column(name = "ap_paterno", nullable = false, length = 80)
	private String ap_paterno;
	
	@Column(name = "ap_materno", nullable = false, length = 80)
	private String ap_materno;
	
	@Column(name = "activo", nullable = false)
	private int activo;
	

}

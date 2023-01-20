package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "t_calificaciones")
@Data
public class Calificaciones {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_calificacion;
	
//	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_materia", nullable = false, foreignKey = @ForeignKey(name = "FK_MATERIAS_CALIFICACIOENS"))
	private Materias materia;
	
//	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "id_alumno", nullable = false, foreignKey = @ForeignKey(name = "FK_ALUMNOS_CALIFICACIONES"))
	private Alumnos alumno;
	
	@Column(name = "calificacion", nullable = false)
	private Float calificacion;
	
	@Column(name = "fecha", nullable = false)
	private LocalDateTime fechaRegistro;
	
}

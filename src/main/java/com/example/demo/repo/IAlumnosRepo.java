package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Alumnos;

public interface IAlumnosRepo extends JpaRepository<Alumnos, Integer> {

}

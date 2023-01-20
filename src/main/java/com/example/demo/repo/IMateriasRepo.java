package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Materias;

public interface IMateriasRepo extends JpaRepository<Materias, Integer> {

}

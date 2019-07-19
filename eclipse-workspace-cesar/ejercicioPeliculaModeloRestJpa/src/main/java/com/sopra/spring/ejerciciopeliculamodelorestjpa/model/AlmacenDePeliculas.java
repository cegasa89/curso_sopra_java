package com.sopra.spring.ejerciciopeliculamodelorestjpa.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sopra.spring.ejerciciopeliculamodelorestjpa.entities.Pelicula;


//@Repository
public interface AlmacenDePeliculas extends JpaRepository<Pelicula, Integer> {

}

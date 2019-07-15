package com.sopra.spring.ejerciciopeliculamodelorestjpa.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.spring.ejerciciopeliculamodelorestjpa.entities.Pelicula;



public interface AlmacenDePeliculas extends JpaRepository<Pelicula, Integer> {

}

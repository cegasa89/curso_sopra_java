package com.sopra.spring.model;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sopra.spring.entities.Pelicula;

public interface AlmacenDePeliculas extends JpaRepository<Pelicula, String> {

}

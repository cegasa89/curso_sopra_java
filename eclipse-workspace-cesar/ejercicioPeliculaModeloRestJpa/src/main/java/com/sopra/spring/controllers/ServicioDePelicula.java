package com.sopra.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.spring.model.AlmacenDePeliculas;

@RestController
public class ServicioDePelicula {

	@Autowired
	private AlmacenDePeliculas almacen;
	
	
	
	
}

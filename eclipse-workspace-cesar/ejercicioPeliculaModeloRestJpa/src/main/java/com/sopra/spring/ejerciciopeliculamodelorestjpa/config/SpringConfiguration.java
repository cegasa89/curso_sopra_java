package com.sopra.spring.ejerciciopeliculamodelorestjpa.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sopra.spring.ejerciciopeliculamodelorestjpa.entities.Pelicula;
import com.sopra.spring.ejerciciopeliculamodelorestjpa.model.AlmacenDePeliculas;



@Configuration
public class SpringConfiguration {

	@Bean
	public CommandLineRunner iniciarBBDD(AlmacenDePeliculas almacen) {
		return args -> {
			almacen.save(new Pelicula("pepe", "el botella", "el botella", "el botella"));
			almacen.save(new Pelicula("pepe2", "el botella2", "el botella2", "el botella2"));
			almacen.save(new Pelicula("pepe3", "el botella3", "el botella3", "el botella3"));
		};
	}
	
}

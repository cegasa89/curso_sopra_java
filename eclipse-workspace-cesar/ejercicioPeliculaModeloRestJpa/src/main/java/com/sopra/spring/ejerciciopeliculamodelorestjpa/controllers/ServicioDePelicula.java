package com.sopra.spring.ejerciciopeliculamodelorestjpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.spring.ejerciciopeliculamodelorestjpa.entities.Pelicula;
import com.sopra.spring.ejerciciopeliculamodelorestjpa.model.AlmacenDePeliculas;



@RestController
public class ServicioDePelicula {

	@Autowired
	private AlmacenDePeliculas almacen;

	public AlmacenDePeliculas getAlmacen() {
		return almacen;
	}

	public void setAlmacen(AlmacenDePeliculas almacen) {
		this.almacen = almacen;
	}
	
	
	@GetMapping("/pelicula")
	public List<Pelicula> peliculas(){
		return almacen.findAll();
		
	}
	
	
	@GetMapping("/pelicula/{id}")
	public Pelicula peliculas(@PathVariable Integer id) {	
		return almacen.findById(id).orElse(null);
		
	}
	
	@PostMapping("/pelicula")
	public Pelicula agregarPeliculaAlInventario(@RequestBody Pelicula pelicula) {
		return almacen.save(pelicula);
		
	}
	
	
	@PutMapping("/pelicula/{id}")
	public Pelicula actualizarPelicula(@RequestBody Pelicula pelicula,@PathVariable Integer id) {
		return almacen.findById(id).map(clienteEncontrado -> {clienteEncontrado.setTitulo(pelicula.getTitulo());
		clienteEncontrado.setDirector(pelicula.getDirector());return almacen.save(clienteEncontrado);})
				.orElseGet(() -> {pelicula.setIdentificador(id); return almacen.save(pelicula);})
				;
		
	}
	
	@DeleteMapping("/pelicula/{id}")
	public void eliminarPelicula(@PathVariable Integer id) {
		almacen.deleteById(id);
	}
	
	
}

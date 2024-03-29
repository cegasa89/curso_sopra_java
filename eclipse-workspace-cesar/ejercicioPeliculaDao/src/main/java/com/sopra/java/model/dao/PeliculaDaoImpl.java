package com.sopra.java.model.dao;

import java.util.Collection;
import java.util.Map;

import com.sopra.java.model.entities.Pelicula;

public class PeliculaDaoImpl implements IPeliculaDao<Pelicula> {
	
	
	private Map<String,Pelicula> almacenPeliculas;

	
	
	
	public PeliculaDaoImpl(Map<String, Pelicula> almacenPeliculas) {
		super();
		this.almacenPeliculas = almacenPeliculas;
	}

	@Override
	public void create(Pelicula elemento) {
		almacenPeliculas.putIfAbsent(elemento.getTitulo(), elemento);
		
	}

	@Override
	public Pelicula update(Pelicula elemento) {
		almacenPeliculas.replace(elemento.getTitulo(), elemento);
		return null;
	}

	@Override
	public void delete(Pelicula elemento) {
		almacenPeliculas.remove(elemento.getTitulo(), elemento);		
	}

	@Override
	public Collection<Pelicula> list() {
		// TODO Auto-generated method stub
		return almacenPeliculas.values();
	}

	@Override
	public Pelicula readById(Integer id) {
		return almacenPeliculas.get(id);

	}



}

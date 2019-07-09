package com.sopra.java.model.business;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sopra.java.model.dao.IPeliculaDao;
import com.sopra.java.model.dao.PeliculaDaoImpl;
import com.sopra.java.model.entities.Pelicula;


@Service
public class GestorPelicula {

	@Autowired
	private IPeliculaDao<Pelicula> peliculaDao;

	public GestorPelicula(IPeliculaDao<Pelicula> peliculaDao) {
		super();
		this.peliculaDao = peliculaDao;
	}

	public Set<Pelicula> altaPelicula(List<Pelicula> altasPeliculas) {
		for (Pelicula pelicula : altasPeliculas) {
			peliculaDao.create(pelicula);
		}
		return null;
	}

	public Set<Pelicula> listarPelicula() {
		Set<Pelicula> setDePeliculas = new HashSet<>();
		for (Pelicula pelicula : peliculaDao.list()) {
			setDePeliculas.add(pelicula);
		}
		return setDePeliculas;
	}

	public Set<Pelicula> updatePelicula(List<Pelicula> Peliculas) {
		for (Pelicula pelicula : Peliculas) {
			peliculaDao.update(pelicula);
		}
		return null;
	}

	public Set<Pelicula> deletePelicula(List<Pelicula> Peliculas) {
		for (Pelicula pelicula : Peliculas) {
			peliculaDao.delete(pelicula);
		}
		return null;
	}

}

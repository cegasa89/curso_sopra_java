package com.sopra.java.patterns;

import java.util.HashMap;

import com.sopra.java.model.dao.IPeliculaDao;
import com.sopra.java.model.dao.PeliculaDaoImpl;
import com.sopra.java.model.entities.Pelicula;


public class Factory {
	
	public static IPeliculaDao<Pelicula> peliculaDao;
	
	public static IPeliculaDao<Pelicula> getPeliculaDao(){
		if(peliculaDao == null) {
			peliculaDao = new PeliculaDaoImpl(new HashMap<String, Pelicula>());
		}
		return peliculaDao;
	}

}

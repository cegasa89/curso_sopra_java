package com.sopra.java.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sopra.java.model.business.GestorPelicula;
import com.sopra.java.model.entities.Pelicula;

public class Lanzador {
	public static void main(String[] args) {
		
		GestorPelicula gestionPelicula = new GestorPelicula();

		List<Pelicula> altasPeliculas = new ArrayList<Pelicula>();
		
		List<Pelicula> UPDATEPeliculas = new ArrayList<Pelicula>();
		
		List<Pelicula> DELETEPeliculas = new ArrayList<Pelicula>();


		
		Pelicula peli1 = new Pelicula("pepe","pepe","pepe y la cabra","Terror");
		Pelicula peli2 = new Pelicula("pepe2","pepe2","pepe2 y la cabra","Terror2");
		Pelicula peli3 = new Pelicula("pepe3","pepe3","pepe3 y la cabra","Terror3");
		Pelicula peli4 = new Pelicula("pepe4","pepe4","pepe4 y la cabra","Terror4");
		Pelicula peli5 = new Pelicula("pepe5","pepe5","pepe5 y la cabra","Terror5");
		Pelicula peli6 = new Pelicula("pepe6","pepe6","pepe6 y la cabra","Terror6");
		Pelicula peli7 = new Pelicula("pepe7","pepe7","pepe7 y la cabra","Terror7");
		Pelicula peli8 = new Pelicula("pepe8","pepe8","pepe8 y la cabra","Terror8");
		Pelicula peli9 = new Pelicula("pepe9","pepe9","pepe9 y la cabra","Terror9");
		Pelicula peli10 = new Pelicula("pepe10","pepe10","pepe10 y la cabra","Terror10");
		
		
		altasPeliculas.add(peli1);
		altasPeliculas.add(peli2);
		altasPeliculas.add(peli3);
		altasPeliculas.add(peli4);
		altasPeliculas.add(peli5);
		altasPeliculas.add(peli6);
		altasPeliculas.add(peli7);
		altasPeliculas.add(peli8);
		altasPeliculas.add(peli9);
		altasPeliculas.add(peli10);
		
		gestionPelicula.altaPelicula(altasPeliculas);
		
		
		System.out.println(gestionPelicula.listarPelicula());
		
		peli1.setDirector("ATAWALPA");
		peli7.setDirector("ATAWALPA");
				
		UPDATEPeliculas.add(peli1);
		UPDATEPeliculas.add(peli7);		
		
		gestionPelicula.updatePelicula(UPDATEPeliculas);
		
		System.out.println(gestionPelicula.listarPelicula());
		
		DELETEPeliculas.add(peli1);
		DELETEPeliculas.add(peli7);
				
		gestionPelicula.deletePelicula(DELETEPeliculas);
		
		System.out.println(gestionPelicula.listarPelicula());



		

}
}

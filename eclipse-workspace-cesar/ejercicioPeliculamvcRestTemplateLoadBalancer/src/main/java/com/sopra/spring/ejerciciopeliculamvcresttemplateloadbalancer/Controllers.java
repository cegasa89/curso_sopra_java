package com.sopra.spring.ejerciciopeliculamvcresttemplateloadbalancer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.sopra.spring.ejerciciopeliculamodelorestjpa.entities.Pelicula;




@Controller
public class Controllers {

	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("pelicula",new Pelicula());
		return "pelicula";
	}

	@RequestMapping("/listadoDePeliculas")
	public String listadoDePeliculas(Model model) {
		String urlDeAccesoAlServicio = "http://pelicularesJpa/pelicula";
		ResponseEntity<List> respuestaDelServidor = restTemplate.exchange(
				urlDeAccesoAlServicio, 
				HttpMethod.GET, 
				null, 
				List.class);
				List peliculas = respuestaDelServidor.getBody();
				model.addAttribute("peliculas",peliculas);
		return "peliculas";
	}
	@RequestMapping("/nuevaPelicula")
	public String altaPelicula(
			@RequestParam("titulo") String titulo,
			@RequestParam("director") String director,
			@RequestParam("sinopsis") String sinopsis,
			@RequestParam("categorias") String categorias,
			Model model) {
		String urlDeAccesoAlServicio = "http://pelicularesJpa/pelicula";
		Pelicula pelicula = new Pelicula(titulo, director, sinopsis, categorias);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Pelicula> entidadAEnviar = new HttpEntity<Pelicula>(pelicula,headers);
		ResponseEntity<Pelicula> entity = restTemplate.exchange(
				urlDeAccesoAlServicio, 
				HttpMethod.POST, 
				entidadAEnviar, 
				Pelicula.class);
		Pelicula peliculas = entity.getBody();
		model.addAttribute("pelicula", peliculas);
		return "pelicula";
		
		
		
		
		
		
		
		
		
	}
	
	
}

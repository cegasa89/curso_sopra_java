package com.sopra.java.model.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import com.sopra.java.model.business.GestorPelicula;
import com.sopra.java.model.entities.Pelicula;

/**
 * Servlet implementation class AddPelicula
 */
@Controller
@Scope("request")
public class AddPelicula extends HttpServlet {
	
	@Autowired
	public GestorPelicula gestorPelicula;


	
	
	@RequestMapping("home")
	public ModelAndView verFormulario() {
		return new ModelAndView("formularioPeliculas");
	}
	

	
	@RequestMapping("muestramelon")
	public ModelAndView muestramelon(@RequestParam("titulo") String titulo,@RequestParam("director") String director,
			@RequestParam("sinopsis") String sinopsis,@RequestParam("categorias") String categorias) {
		// TODO Auto-generated method stub
		List<Pelicula> altasPeliculas = new ArrayList<Pelicula>();

		if (titulo != null) {
			
			Pelicula peli1 = new Pelicula(titulo, director,
					sinopsis, categorias);

			altasPeliculas.add(peli1);

			gestorPelicula.altaPelicula(altasPeliculas);
			
			ModelAndView modelAndView =  new ModelAndView("listar");
			modelAndView.addObject("listaDePeliculas",gestorPelicula.listarPelicula() );
			return modelAndView;

		}
		return null;
	}

}

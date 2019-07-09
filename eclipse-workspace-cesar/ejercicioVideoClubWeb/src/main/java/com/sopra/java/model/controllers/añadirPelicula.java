package com.sopra.java.model.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sopra.java.model.business.GestorPelicula;
import com.sopra.java.model.dao.PeliculaDaoImpl;
import com.sopra.java.model.entities.Pelicula;

/**
 * Servlet implementation class añadirPelicula
 */
@WebServlet("/añadirPelicula")
public class añadirPelicula extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public GestorPelicula gestorPelicula = new GestorPelicula(new PeliculaDaoImpl(new HashMap<String, Pelicula>()));
	private List<Pelicula> altasPeliculas = new ArrayList<Pelicula>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public añadirPelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	// http://localhost:8080/ejercicioVideoClubWeb/añadirPelicula?titulo=sdfsdsdff&director=asdas$sinopsis=sdfsdf&categorias=rtrt45

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		if (request.getParameter("titulo") != null) {
			Pelicula peli1 = new Pelicula(request.getParameter("titulo"), request.getParameter("director"),
					request.getParameter("sinopsis"), request.getParameter("categorias"));

			altasPeliculas.add(peli1);

			gestorPelicula.altaPelicula(altasPeliculas);

			System.out.println(gestorPelicula.listarPelicula());
		}

	}

}

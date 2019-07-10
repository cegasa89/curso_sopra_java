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

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sopra.java.model.business.GestorPelicula;
import com.sopra.java.model.entities.Pelicula;

/**
 * Servlet implementation class AddPelicula
 */
@WebServlet("/AddPelicula")
public class AddPelicula extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext context;
	public static GestorPelicula gestorPelicula;

	@Override
	public void init() throws ServletException {

		this.context = WebApplicationContextUtils
				.getRequiredWebApplicationContext(getServletContext());
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Pelicula> altasPeliculas = new ArrayList<Pelicula>();
		gestorPelicula = context.getBean(GestorPelicula.class);

		if (request.getParameter("titulo") != null) {
			
			Pelicula peli1 = new Pelicula(request.getParameter("titulo"), request.getParameter("director"),
					request.getParameter("sinopsis"), request.getParameter("categorias"));

			altasPeliculas.add(peli1);

			gestorPelicula.altaPelicula(altasPeliculas);

			System.out.println(gestorPelicula.listarPelicula());
			
			GestorPelicula bean = context.getBean("gestorPelicula",GestorPelicula.class);
			Set<Pelicula> listarPelicula = bean.listarPelicula();
			request.setAttribute("listarPelicula",listarPelicula );

			getServletContext().getRequestDispatcher("/WEB-INF/jsps/listar.jsp")
			.forward(request, response);

		}
	}

}

package com.sopra.java.model.entities;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component(value = "pelicula")
@Scope(value = "prototype")
public class Pelicula {
	
	
	private static AtomicInteger secuencia;
	
	static {
		secuencia = new AtomicInteger();
	}

	private Integer identificador;
	private String titulo;
	private String director;
	private String sinopsis;
	
	private String categorias;

	public Pelicula() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pelicula(String titulo, String director, String sinopsis, String categorias) {
		super();
		this.identificador = secuencia.incrementAndGet();;
		this.titulo = titulo;
		this.director = director;
		this.sinopsis = sinopsis;
		this.categorias = categorias;
	}

	

	@Override
	public String toString() {
		return "Pelicula [identificador=" + identificador + ", titulo=" + titulo + ", director=" + director
				+ ", sinopsis=" + sinopsis + ", categorias=" + categorias + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

	public static AtomicInteger getSecuencia() {
		return secuencia;
	}

	public static void setSecuencia(AtomicInteger secuencia) {
		Pelicula.secuencia = secuencia;
	}

	public Integer getIdentificador() {
		return identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getCategorias() {
		return categorias;
	}

	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}
	
		

}

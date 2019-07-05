package com.sopra.java.model.dao;

import java.util.Collection;

public interface IPeliculaDao<T> {

	void create(T elemento);

	T update(T elemento);

	void delete(T elemento);

	Collection<T> list();
	
	T readById(Integer id);


}

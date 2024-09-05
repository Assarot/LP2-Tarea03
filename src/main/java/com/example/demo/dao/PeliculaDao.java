package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Pelicula;

public interface PeliculaDao {
	Pelicula create(Pelicula p);
	Pelicula update(Pelicula p);
	void delete(Long id);
	Optional<Pelicula> read(Long id);
	List<Pelicula> readAll();
}

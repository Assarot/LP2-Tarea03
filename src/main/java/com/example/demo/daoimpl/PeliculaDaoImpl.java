package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.PeliculaDao;
import com.example.demo.entity.Pelicula;
import com.example.demo.repository.PeliculaRepository;

@Component
public class PeliculaDaoImpl implements PeliculaDao{
	@Autowired
	private PeliculaRepository peliculaRepository;
	@Override
	public Pelicula create(Pelicula p) {
		// TODO Auto-generated method stub
		return peliculaRepository.save(p);
	}

	@Override
	public Pelicula update(Pelicula p) {
		// TODO Auto-generated method stub
		return peliculaRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		peliculaRepository.deleteById(id);
	}

	@Override
	public Optional<Pelicula> read(Long id) {
		// TODO Auto-generated method stub
		return peliculaRepository.findById(id);
	}

	@Override
	public List<Pelicula> readAll() {
		// TODO Auto-generated method stub
		return peliculaRepository.findAll();
	}

}

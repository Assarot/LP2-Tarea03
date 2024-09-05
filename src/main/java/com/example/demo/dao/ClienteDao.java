package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Cliente;

public interface ClienteDao {
	Cliente create(Cliente c);
	Cliente update(Cliente c);
	void delete(Long id);
	Optional<Cliente> read(Long id);
	List<Cliente> readAll();
}

package com.example.demo.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.ClienteDao;
import com.example.demo.entity.Cliente;
import com.example.demo.repository.ClienteRepository;
@Component
public class ClienteDaoImpl implements ClienteDao{
	@Autowired
	private ClienteRepository clienteRepository;
	@Override
	public Cliente create(Cliente c) {
		// TODO Auto-generated method stub
		return clienteRepository.save(c);
	}

	@Override
	public Cliente update(Cliente c) {
		// TODO Auto-generated method stub
		return clienteRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

}

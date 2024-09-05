package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AccesoDao;
import com.example.demo.entity.Acceso;
import com.example.demo.service.AccesoService;

@Service
public class AccesoServiceImpl  implements AccesoService{
	@Autowired
	private AccesoDao accesoDao;
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return accesoDao.create(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return accesoDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesoDao.delete(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return accesoDao.read(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesoDao.readAll();
	}

}

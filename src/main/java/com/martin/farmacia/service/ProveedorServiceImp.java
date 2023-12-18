package com.martin.farmacia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martin.farmacia.entity.Proveedor;
import com.martin.farmacia.repository.ProveedorRepository;

@Service
public class ProveedorServiceImp implements ProveedorService{
	@Autowired
	private ProveedorRepository repository;

	@Override
	public List<Proveedor> listaTodos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Proveedor InsertaProveedor(Proveedor obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public Proveedor ActualizaProveedor(Proveedor prov) {
		// TODO Auto-generated method stub
		return repository.save(prov);
	}

	@Override
	public void eliminaProveedor(int idProveedor) {
		// TODO Auto-generated method stub
		repository.deleteById(idProveedor);
	}
}

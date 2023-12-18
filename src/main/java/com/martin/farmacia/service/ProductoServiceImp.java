package com.martin.farmacia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martin.farmacia.entity.Producto;
import com.martin.farmacia.repository.ProductoRepository;

@Service
public class ProductoServiceImp implements ProductoService{
	@Autowired
	private ProductoRepository repository;

	@Override
	public List<Producto> listaTodos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Producto InsertaProducto(Producto obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public Producto ActualizaProducto(Producto cli) {
		// TODO Auto-generated method stub
		return repository.save(cli);
	}

	@Override
	public void eliminaProducto(int idProducto) {
		// TODO Auto-generated method stub
		repository.deleteById(idProducto);
	}
}

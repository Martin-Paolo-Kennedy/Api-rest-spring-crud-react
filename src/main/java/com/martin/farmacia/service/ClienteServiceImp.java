package com.martin.farmacia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.martin.farmacia.entity.Cliente;
import com.martin.farmacia.repository.ClienteRepository;

@Service
public class ClienteServiceImp implements ClienteService{
	@Autowired
	private ClienteRepository repository;

	@Override
	public List<Cliente> listaTodos() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente InsertaCliente(Cliente obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}

	@Override
	public Cliente ActualizaCliente(Cliente cli) {
		// TODO Auto-generated method stub
		return repository.save(cli);
	}

	@Override
	public void eliminaCliente(int idCliente) {
		// TODO Auto-generated method stub
		repository.deleteById(idCliente);
	}
}

package com.martin.farmacia.service;

import java.util.List;

import com.martin.farmacia.entity.Cliente;



public interface ClienteService {
	public abstract List<Cliente> listaTodos();
	public abstract Cliente InsertaCliente(Cliente obj);
	public abstract Cliente ActualizaCliente(Cliente cli);
	public abstract void eliminaCliente(int idCliente);
}

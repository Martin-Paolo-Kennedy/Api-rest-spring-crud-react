package com.martin.farmacia.service;

import java.util.List;

import com.martin.farmacia.entity.Proveedor;

public interface ProveedorService {
	public abstract List<Proveedor> listaTodos();
	public abstract Proveedor InsertaProveedor(Proveedor obj);
	public abstract Proveedor ActualizaProveedor(Proveedor prov);
	public abstract void eliminaProveedor(int idProveedor);
}

package com.martin.farmacia.service;

import java.util.List;

import com.martin.farmacia.entity.Producto;

public interface ProductoService {
	public abstract List<Producto> listaTodos();
	public abstract Producto InsertaProducto(Producto obj);
	public abstract Producto ActualizaProducto(Producto cli);
	public abstract void eliminaProducto(int idProducto);
}

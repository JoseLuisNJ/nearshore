package com.nearshore.service;

import java.util.List;

import com.nearshore.model.CatProveedor;

public interface ProveedorService {
	public CatProveedor ObtieneProveedorDescripcion(String descripcion);
	public CatProveedor CreaProveedor(CatProveedor proveedor);
	public CatProveedor ObtieneProveedorId(Long id);
	public List<CatProveedor> ObtieneProveedores();
}

package com.nearshore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nearshore.model.CatProveedor;
import com.nearshore.repository.ProveedorRepository;

@Service
public class ProveedorServiceImp implements ProveedorService {
	@Autowired
	public ProveedorRepository proveedorRepository; 
	
	@Override
	public CatProveedor ObtieneProveedorDescripcion(String descripcion) {
		CatProveedor proveedor = proveedorRepository.findByDescripcion(descripcion);
		
		return proveedor;
	}

	@Override
	public CatProveedor CreaProveedor(CatProveedor proveedor) {
		CatProveedor proveedorCreado = proveedorRepository.save(proveedor);
		
		return proveedorCreado;
	}

	@Override
	public CatProveedor ObtieneProveedorId(Long id) {
		CatProveedor proveedor = proveedorRepository.findOne(id);
		
		return proveedor;
	}

	@Override
	public List<CatProveedor> ObtieneProveedores(){
		List<CatProveedor> proveedores = proveedorRepository.findAll();
		
		return proveedores;
	}
}

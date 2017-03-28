package com.nearshore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nearshore.model.CatProveedor;

@Repository
public interface ProveedorRepository 
	extends JpaRepository<CatProveedor, Long> {
	public CatProveedor findByDescripcion(String descripcion);
}

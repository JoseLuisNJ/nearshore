package com.nearshore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nearshore.model.CatPais;

@Repository
public interface PaisRepository 
	extends JpaRepository<CatPais, Long> {
	public CatPais findByDescripcion(String descripcion);
}

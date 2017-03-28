package com.nearshore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nearshore.model.CatPerfil;

@Repository
public interface PerfilRepository 
	extends JpaRepository<CatPerfil, Long> {
	public CatPerfil findByDescripcion(String descripcion);
}

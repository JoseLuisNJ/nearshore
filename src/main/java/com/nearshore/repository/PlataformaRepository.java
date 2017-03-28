package com.nearshore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nearshore.model.CatPlataforma;

@Repository
public interface PlataformaRepository 
	extends JpaRepository<CatPlataforma, Long> {
	public CatPlataforma findByDescripcion(String descripcion);
	public CatPlataforma findByComentarios(String comentarios);
}

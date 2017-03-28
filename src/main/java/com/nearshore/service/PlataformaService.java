package com.nearshore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nearshore.model.CatPlataforma;


public interface PlataformaService {
	public CatPlataforma ObtienePlataformaDescripcion(String descripcion);
	public CatPlataforma ObtienePlataformaComentarios(String comentarios);
	public CatPlataforma CreaPlataforma(CatPlataforma plataforma);
	public CatPlataforma ObtienePlataformaId(Long id);
	public List<CatPlataforma> ObtienePlataformas();
}

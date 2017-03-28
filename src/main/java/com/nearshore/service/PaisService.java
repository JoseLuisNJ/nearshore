package com.nearshore.service;

import java.util.List;

import com.nearshore.model.CatPais;

public interface PaisService {
	public CatPais ObtienePaisDescripcion(String descripcion);
	public CatPais CreaPais(CatPais pais);
	public CatPais ObtienePaisId(Long id);
	public List<CatPais> ObtienePaises();
}

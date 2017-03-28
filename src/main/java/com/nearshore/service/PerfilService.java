package com.nearshore.service;

import java.util.List;

import com.nearshore.model.CatPerfil;

public interface PerfilService {
	public CatPerfil ObtienePerfilDescripcion(String descripcion);
	public CatPerfil CreaPerfil(CatPerfil perfil);
	public CatPerfil ObtienePerfilId(Long id);
	public List<CatPerfil> ObtienePerfiles();
}

package com.nearshore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nearshore.model.CatPerfil;
import com.nearshore.repository.PerfilRepository;

@Service
public class PerfilServiceImp implements PerfilService {

	@Autowired 
	private PerfilRepository perfilRepository;
	
	@Override
	public CatPerfil ObtienePerfilDescripcion(String descripcion) {
		CatPerfil perfil = perfilRepository.findByDescripcion(descripcion);
		
		return perfil;
	}

	@Override
	public CatPerfil CreaPerfil(CatPerfil perfil){
		return perfilRepository.save(perfil);
	}
	
	@Override
	public CatPerfil ObtienePerfilId(Long id){
		return perfilRepository.getOne(id);
	}
	
	@Override
	public List<CatPerfil> ObtienePerfiles(){
		return perfilRepository.findAll();
	}
}

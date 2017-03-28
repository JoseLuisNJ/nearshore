package com.nearshore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nearshore.model.CatPais;
import com.nearshore.repository.PaisRepository;

@Service
public class PaisServiceImp implements PaisService {

	@Autowired 
	private PaisRepository paisRepository;
	
	@Override
	public CatPais ObtienePaisDescripcion(String descripcion) {
		CatPais pais = paisRepository.findByDescripcion(descripcion);
		
		return pais;
	}

	@Override
	public CatPais CreaPais(CatPais pais){
		return paisRepository.save(pais);
	}
	
	@Override
	public CatPais ObtienePaisId(Long id){
		return paisRepository.getOne(id);
	}
	
	@Override
	public List<CatPais> ObtienePaises(){
		return paisRepository.findAll();
	}
}

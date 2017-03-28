package com.nearshore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nearshore.model.CatPlataforma;
import com.nearshore.repository.PlataformaRepository;

@Service
public class PlataformaServiceImp implements PlataformaService {

	@Autowired 
	private PlataformaRepository plataformaRepository;
	
	@Override
	public CatPlataforma ObtienePlataformaDescripcion(String descripcion) {
		CatPlataforma plataforma = plataformaRepository.findByDescripcion(descripcion);
		
		return plataforma;
	}

	@Override
	public CatPlataforma ObtienePlataformaComentarios(String comentarios) {
		CatPlataforma plataforma = plataformaRepository.findByComentarios(comentarios);
		
		return plataforma;
	}
	
	@Override
	public CatPlataforma CreaPlataforma(CatPlataforma plataforma){
		return plataformaRepository.save(plataforma);
	}
	
	@Override
	public CatPlataforma ObtienePlataformaId(Long id){
		return plataformaRepository.getOne(id);
	}
	
	@Override
	public List<CatPlataforma> ObtienePlataformas(){
		return plataformaRepository.findAll();
	}
}

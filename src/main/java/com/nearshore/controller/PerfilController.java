package com.nearshore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nearshore.model.CatPerfil;
import com.nearshore.service.PerfilService;

@RestController
public class PerfilController {
	@Autowired
	private PerfilService perfilService;
	
	@RequestMapping(value = "/perfiles", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CatPerfil> CreaPerfil(@RequestBody CatPerfil perfil){
		CatPerfil perfilCreado = perfilService.CreaPerfil(perfil);
		
		return new ResponseEntity<CatPerfil> (perfilCreado, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/perfiles/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CatPerfil> ObtienePerfil(@PathVariable("id") Long id){
		CatPerfil p = perfilService.ObtienePerfilId(id);

		return new ResponseEntity<CatPerfil>(p, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/perfiles", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CatPerfil>> ObtienePerfiles(){
		List<CatPerfil> perfiles = perfilService.ObtienePerfiles();
		
		return new ResponseEntity<List<CatPerfil>>(perfiles, HttpStatus.OK);
	}
}

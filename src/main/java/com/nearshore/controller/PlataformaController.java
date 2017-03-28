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

import com.nearshore.service.PlataformaService;
import com.nearshore.model.CatPlataforma;


@RestController
public class PlataformaController {
	@Autowired
	private PlataformaService plataformaService;


	@RequestMapping(value = "/plataformas", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CatPlataforma> CreaPlataforma(@RequestBody CatPlataforma plataforma){
		CatPlataforma plataformaCreado = plataformaService.CreaPlataforma(plataforma);
		
		return new ResponseEntity<CatPlataforma> (plataformaCreado, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/plataformas/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CatPlataforma> ObtienePlataforma(@PathVariable("id") Long id){
		CatPlataforma p = plataformaService.ObtienePlataformaId(id);

		return new ResponseEntity<CatPlataforma>(p, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/plataformas", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CatPlataforma>> ObtienePlataforma(){
		List<CatPlataforma> plataformas = plataformaService.ObtienePlataformas();
		
		return new ResponseEntity<List<CatPlataforma>>(plataformas, HttpStatus.OK);
	}
}

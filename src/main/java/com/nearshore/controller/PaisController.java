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

import com.nearshore.service.PaisService;
import com.nearshore.model.CatPais;


@RestController
public class PaisController {
	@Autowired
	private PaisService paisService;


	@RequestMapping(value = "/paises", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CatPais> CreaPais(@RequestBody CatPais pais){
		CatPais paisCreado = paisService.CreaPais(pais);
		
		return new ResponseEntity<CatPais> (paisCreado, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/paises/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CatPais> ObtienePais(@PathVariable("id") Long id){
		CatPais p = paisService.ObtienePaisId(id);

		return new ResponseEntity<CatPais>(p, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/paises", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CatPais>> ObtienePaises(){
		List<CatPais> paises = paisService.ObtienePaises();
		
		return new ResponseEntity<List<CatPais>>(paises, HttpStatus.OK);
	}
}

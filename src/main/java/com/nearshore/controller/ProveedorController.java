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

import com.nearshore.model.CatProveedor;
import com.nearshore.service.ProveedorService;

@RestController
public class ProveedorController {
	@Autowired
	private ProveedorService proveedorService;
	
	@RequestMapping(value = "/proveedores", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CatProveedor> CreaProveedor(@RequestBody CatProveedor proveedor){
		CatProveedor proveedorCreado = proveedorService.CreaProveedor(proveedor);
		
		return new ResponseEntity<CatProveedor> (proveedorCreado, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/proveedores/{id}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CatProveedor> ObtieneProveedor(@PathVariable("id") Long id){
		CatProveedor proveedor = proveedorService.ObtieneProveedorId(id);

		return new ResponseEntity<CatProveedor>(proveedor, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/proveedores", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CatProveedor>> ObtieneProveedores(){
		List<CatProveedor> proveedores = proveedorService.ObtieneProveedores();
		
		return new ResponseEntity<List<CatProveedor>>(proveedores, HttpStatus.OK);
	}
}

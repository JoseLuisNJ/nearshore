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

import com.nearshore.model.Usuario;
import com.nearshore.service.PerfilService;
import com.nearshore.service.PlataformaService;
import com.nearshore.service.ProveedorService;
import com.nearshore.service.UsuarioService;
import com.nearshore.service.PaisService;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private ProveedorService proveedorService;
	
	@Autowired
	private PerfilService perfilService;
	
	@Autowired
	private PlataformaService plataformaService;
	
	@Autowired
	private PaisService paisService;	
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Usuario>> ObtieneUsuarios(){
		List<Usuario> usuarios = usuarioService.ObtieneUsuarios();
		
		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/usuarios", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String CreateUser(@RequestBody Usuario usuario){
		System.out.println("TEST");
		usuarioService.Create(usuario);
		
		return "OK";
	}
	
	@RequestMapping(value = "/usuarios/{id}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable("id") String soeid) {
		Usuario usuario = usuarioService.obtieneUsuarioId(soeid);
		
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK); 
	}
	
	@RequestMapping(value = "/usuarios/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Usuario> BorraUsuario(@PathVariable("id") String soeid) {
		usuarioService.BorraUsuario(soeid);
		
		return new ResponseEntity<Usuario>(HttpStatus.NO_CONTENT); 
	}
}

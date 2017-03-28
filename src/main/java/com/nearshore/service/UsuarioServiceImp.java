package com.nearshore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nearshore.model.Usuario;
import com.nearshore.repository.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario Create(Usuario usuario) {
		Usuario usuarioPersisted = usuarioRepository.save(usuario);
		
		return usuarioPersisted;
	}

	@Override
	public Usuario obtieneUsuarioId(String SOEID){
		Usuario usuario = usuarioRepository.findOne(SOEID);
				
		return usuario;
	}
	
	@Override
	public List<Usuario> ObtieneUsuarios(){
		List<Usuario> usuarios = 
				usuarioRepository.findAll();
		
		return usuarios;
	}
	
	@Override
	public void BorraUsuario(String SOEID){
		usuarioRepository.delete(SOEID);
	}
}

package com.nearshore.service;

import java.util.List;

import com.nearshore.model.Usuario;

public interface UsuarioService {
	public Usuario Create(Usuario usuario);
	public Usuario obtieneUsuarioId(String SOEID);
	public List<Usuario> ObtieneUsuarios();
	public void BorraUsuario(String SOEID);
}

package com.nearshore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nearshore.model.Usuario;

@Repository
public interface UsuarioRepository 
	extends JpaRepository<Usuario, String> {

}

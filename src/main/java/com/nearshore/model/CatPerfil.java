package com.nearshore.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The persistent class for the CAT_PERFIL database table.
 * 
 */

@Entity
@Table(name="CAT_PERFIL", uniqueConstraints=@UniqueConstraint(columnNames="descripcion"))
@NamedQuery(name="CatPerfil.findAll", query="SELECT c FROM CatPerfil c")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CatPerfil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id_Perfil")
	private Long id_Perfil;
	
	@Column(name="Descripcion")
	private String descripcion;
	
	public CatPerfil() {
	}
	
	public CatPerfil(String descripcion){
		this.descripcion = descripcion;
	}

	public Long getId_Perfil() {
		return this.id_Perfil;
	}

	public void setId_Perfil(Long id_Perfil) {
		this.id_Perfil = id_Perfil;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}

package com.nearshore.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
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
@Table(name="CAT_PLATAFORMA", uniqueConstraints=@UniqueConstraint(columnNames={"descripcion", "comentarios"}))
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CatPlataforma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private Long id;
	
	@Column(name="Descripcion")
	private String descripcion;
	
	@Column(name="Comentarios")
	private String comentarios;
	
	public CatPlataforma() {
	}

	public CatPlataforma(String descripcion, String comentarios){
		this.descripcion = descripcion;
		this.comentarios = comentarios;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}	

}
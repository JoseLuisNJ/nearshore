package com.nearshore.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * The persistent class for the cat_pais database table.
 * 
 */

@Entity
@Table(name="CAT_PAIS", uniqueConstraints=@UniqueConstraint(columnNames="descripcion"))
@NamedQuery(name="CatPais.findAll", query="SELECT c FROM CatPais c")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CatPais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id_Pais")
	private Long id_Pais;
	
	@Column(name="Descripcion")
	private String descripcion;
	
	public CatPais() {
	}

	public CatPais(String descripcion){
		this.descripcion = descripcion;
	}

	public Long getId_Pais() {
		return this.id_Pais;
	}

	public void setId_Pais(Long id_Pais) {
		this.id_Pais = id_Pais;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

}
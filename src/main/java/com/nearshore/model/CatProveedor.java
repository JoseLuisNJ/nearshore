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
 * The persistent class for the CAT_PROVEEDOR database table.
 * 
 */
@Entity

@Table(name="CAT_PROVEEDOR", uniqueConstraints=@UniqueConstraint(columnNames="descripcion"))

@NamedQuery(name="CatProveedor.findAll", query="SELECT c FROM CatProveedor c")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CatProveedor implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private Long id;
	
	@Column(name="Descripcion")
	private String descripcion;
	
	public CatProveedor() {
		
	}

	public CatProveedor(String descripcion){
		this.descripcion = descripcion;
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
}	

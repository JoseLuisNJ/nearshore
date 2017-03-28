package com.nearshore.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * The persistent class for the USUARIO database table.
 * 
 */
@SuppressWarnings("unused")
@Entity
@Table(name="USUARIO")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;
	
	

	@Id
	@Column(name="soeid")
	private String soeid;

	@Column(name="Activo")
	private byte activo;
	
	@Column(name="ApellidoMaterno")
	private String apellidoMaterno;
	
	@Column(name="ApellidoPaterno")
	private String apellidoPaterno;
	
	@Column(name="Clave")
	private String clave;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="PrimerNombre")
	private String primerNombre;
	
	@Column(name="SegundoNombe")
	private String segundoNombe;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="Id_Proveedor")
	private CatProveedor catProveedor;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="Id_Perfil")
	private CatPerfil catPerfil;

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="Id_Plataforma")
	private CatPlataforma catPlataforma;	

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="Id_Pais")
	private CatPais catPais;	
	
	public Usuario() {
	}

	public Usuario(String nombre, CatProveedor proveedor, CatPerfil perfil, CatPlataforma plataforma, CatPais pais){
		this.primerNombre = nombre;
		this.catProveedor = proveedor;
		this.catPerfil = perfil;
		this.catPlataforma = plataforma;
		this.catPais = pais;
	}

	public String getSoeid() {
		return this.soeid;
	}

	public void setSoeid(String soeid) {
		this.soeid = soeid;
	}

	public byte getActivo() {
		return this.activo;
	}

	public void setActivo(byte activo) {
		this.activo = activo;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPrimerNombre() {
		return this.primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombe() {
		return this.segundoNombe;
	}

	public void setSegundoNombe(String segundoNombe) {
		this.segundoNombe = segundoNombe;
	}

	public CatProveedor getCatProveedor() {
		return this.catProveedor;
	}

	public void setCatProveedor(CatProveedor catProveedor) {
		this.catProveedor = catProveedor;
	}

	public CatPerfil getCatPerfil() {
		return this.catPerfil;
	}

	public void setCatPerfil(CatPerfil catPerfil) {
		this.catPerfil = catPerfil;
	}
	
	public CatPlataforma getCatPlataforma() {
		return catPlataforma;
	}

	public void setCatPlataforma(CatPlataforma catPlataforma) {
		this.catPlataforma = catPlataforma;
	}	
	
	public CatPais getCatPais() {
		return catPais;
	}

	public void setCatPais(CatPais catPais) {
		this.catPais = catPais;
	}		
	
}

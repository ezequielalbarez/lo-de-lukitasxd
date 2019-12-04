package com.cdainfo.afip.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UsuarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clave_fiscal;
	
	@Column(name = "dni")
	private Integer dni;
	
	@Column(name = "nombre")
	private String nombre;
	
	
	@Column(name = "apellido")
	private String apellido;


	public Long getClave_fiscal() {
		return clave_fiscal;
	}

	public void setClave_fiscal(Long clave) {
		this.clave_fiscal = clave;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

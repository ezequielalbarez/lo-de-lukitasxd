package com.cdainfo.afip.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contribuyente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long clave;
	
	@Column(name = "dni")
	private Integer dni;
	
	@Column(name = "email")
	private String email;

	public Long getClave() {
		return clave;
	}

	public void setClave(Long clave) {
		this.clave = clave;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

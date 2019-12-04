package com.cdainfo.afip.domain;

//import java.sql.Date;

import javax.persistence.*;

@Entity
public class Impuesto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "fecha_liquidacion")
	private String fechaLiquidacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaLiquidacion() {
		return fechaLiquidacion;
	}

	public void setFechaLiquidacion(String fechaLiquidacion) {
		this.fechaLiquidacion = fechaLiquidacion;
	}
}

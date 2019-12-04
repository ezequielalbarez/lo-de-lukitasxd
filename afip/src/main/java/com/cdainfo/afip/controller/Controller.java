package com.cdainfo.afip.controller;

import java.util.List;

import com.cdainfo.afip.domain.UsuarioEntity;
import com.cdainfo.afip.domain.Impuesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.cdainfo.afip.repository.ContribuyenteRepository;
import com.cdainfo.afip.repository.ImpuestoRepository;

@RestController
public class Controller {
	
	@Autowired 
	ImpuestoRepository impuestoRepository;
	
	@Autowired
	ContribuyenteRepository contribuyenteRepository;
	
	@GetMapping("/impuestos")
	public List<Impuesto> getAllImpuestos() {
		return impuestoRepository.findAll();
	}
	
	@GetMapping("impuesto/{tipo}")
	public Impuesto getImpuesto(@PathVariable String tipo) {
		return impuestoRepository.findByTipoLike(tipo);
	}
	
	@PutMapping("impuesto/{tipo}/{fecha}")
	public Impuesto updateImpuestoDates(@PathVariable String tipo, @PathVariable String fecha) {
		Impuesto impuesto = this.getImpuesto(tipo);
		impuesto.setFechaLiquidacion(fecha);
		
		return impuestoRepository.save(impuesto);
	}
	
	@GetMapping("impuestos/{desde}/{hasta}")
	public List<Impuesto> getAllImpuestosByDates(@PathVariable String desde, @PathVariable String hasta) {
		return impuestoRepository.findByFechaLiquidacionBetween(desde, hasta);
	}
	
	@GetMapping("/contribuyentes")
	public List<UsuarioEntity> getAllContribuyentes() {
		return contribuyenteRepository.findAll();
	}

}

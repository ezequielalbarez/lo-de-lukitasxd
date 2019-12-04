package com.cdainfo.afip.repository;

import org.springframework.stereotype.Repository;

import com.cdainfo.afip.domain.Impuesto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ImpuestoRepository extends JpaRepository<Impuesto, Long> {
	
	Impuesto findByTipoLike(String tipo);
	
	List<Impuesto> findByFechaLiquidacionBetween(String desde, String hasta);
}


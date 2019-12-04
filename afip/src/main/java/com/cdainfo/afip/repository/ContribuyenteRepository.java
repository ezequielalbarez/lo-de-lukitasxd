package com.cdainfo.afip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdainfo.afip.domain.UsuarioEntity;

@Repository
public interface ContribuyenteRepository extends JpaRepository<UsuarioEntity, Long> {
	
}
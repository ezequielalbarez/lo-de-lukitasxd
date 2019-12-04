package com.cdainfo.afip.domain;

import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
public class usuarioximpuesto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cod;
	
	
}

package com.github.marconibraga.es.jdbc.model;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Nacionalidade extends PersistentObject {

	private String municipio;
	private String estado;
	private String pais;
	private String dataEntradaPais;

}

package com.github.marconibraga.es.jdbc.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Comunicacao extends PersistentObject {

	private String meio;
	private String preferencia;
	private String detalhe;
	private String uso;

	@ManyToOne
	@JoinColumn(name = "individuo_id", nullable = false)
	private Individuo individuo;
}

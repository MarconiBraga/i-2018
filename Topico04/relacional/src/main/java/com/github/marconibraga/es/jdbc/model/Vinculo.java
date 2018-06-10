package com.github.marconibraga.es.jdbc.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Vinculo extends PersistentObject {

	private String relacionamento;
	private Date dataInicio;
	private Date dataFim;

	@OneToOne
	private Identificador identificador;

	@ManyToOne
	@JoinColumn(name = "individuo_id", nullable = false)
	private Individuo individuo;

}

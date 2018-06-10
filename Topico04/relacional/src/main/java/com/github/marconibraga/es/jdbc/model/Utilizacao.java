package com.github.marconibraga.es.jdbc.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Utilizacao extends PersistentObject {

	private String uso;
	private Date dataInicial;
	private Date dataFinal;

	@OneToOne(fetch = FetchType.LAZY)
	private Identificador identificador;

	@ManyToOne
	@JoinColumn(name = "nome_id", nullable = false)
	private Nome nome;

}

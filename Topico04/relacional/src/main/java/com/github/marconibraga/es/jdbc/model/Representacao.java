package com.github.marconibraga.es.jdbc.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "representacao")
public class Representacao extends PersistentObject {

	private String utilizacao;
	private String alternativa;

	@ManyToOne(targetEntity = Nome.class)
	@JoinColumn(name = "nome_id", nullable = false)
	private Nome nome;

	@Override
	public String toString() {
		return "Representacao [utilizacao=" + utilizacao + ", alternativa=" + alternativa + "]";
	}
}

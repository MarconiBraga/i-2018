package com.github.marconibraga.es.jdbc.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class LinhaEndereco extends PersistentObject {

	private String ordem;
	private String linha;

	@ManyToOne
	@JoinColumn(name = "endereco_id", nullable = false)
	private Endereco endereco;

	@Override
	public String toString() {
		return "LinhaEndereco [ordem=" + ordem + ", linha=" + linha + "]";
	}

}

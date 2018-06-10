package com.github.marconibraga.es.jdbc.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@lombok.Data
@ToString(exclude = "identificador")
@EqualsAndHashCode(callSuper = false)
@Entity
public class Certidao extends PersistentObject {

	@OneToOne(fetch = FetchType.LAZY)
	private Identificador identificador;
	private String tipo;
	private String cartorio;
	private String livro;
	private String folha;
	private String termo;

}

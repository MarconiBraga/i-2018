package com.github.marconibraga.es.jdbc.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.EqualsAndHashCode;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "nome")
public class Nome extends PersistentObject {

	private String titulos;
	private String nomes;
	private String sobrenomes;
	private String sufixos;
	private boolean usoCondicional;
	
	@OneToMany(mappedBy = "nome")
	private List<Representacao> representacoes;
	
	@OneToMany(mappedBy = "nome")
	private List<Utilizacao> utilizacoes;
	
	@ManyToOne
	@JoinColumn(name = "individuo_id", nullable = false)
	private Individuo individuo;

	@Override
	public String toString() {
		return "Nome [titulos=" + titulos + ", nomes=" + nomes + ", sobrenomes=" + sobrenomes + ", sufixos=" + sufixos
				+ ", usoCondicional=" + usoCondicional + "]";
	}

}

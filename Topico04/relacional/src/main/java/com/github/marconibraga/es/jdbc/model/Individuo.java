package com.github.marconibraga.es.jdbc.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Individuo extends PersistentObject {

	private int surrogateKey;

	@OneToMany(mappedBy = "individuo", fetch = FetchType.EAGER)
	private List<Nome> nomes;

	@OneToOne(mappedBy = "individuo")
	private DadoDemografico dadoDemografico;

	@OneToMany(mappedBy = "individuo")
	private List<Endereco> enderecos;

	@OneToMany(mappedBy = "individuo")
	private List<Identificador> indentificadores;

	@OneToMany(mappedBy = "individuo")
	private List<Vinculo> vinculos;

	@OneToMany(mappedBy = "individuo")
	private List<Comunicacao> comunicacoes;

	@Override
	public String toString() {
		return "Individuo [surrogateKey=" + surrogateKey + ", nomes=" + nomes + "]";
	}

}

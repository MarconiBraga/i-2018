package com.github.marconibraga.es.jdbc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Endereco extends PersistentObject {

	@Column(unique = true)
	private String surrogateKey;
	private String bairro;
	private String distrito;
	private String codigoMunicipio;
	private String estado;
	private String cep;
	private String caixaPostal;
	private String pais;
	private String tipo;

	@OneToOne
	private Data dataInicio;

	@OneToOne
	private Data dataFim;
	
	@OneToMany(mappedBy = "endereco")
	private List<LinhaEndereco> linhaEndereco;
	
	@ManyToOne
	@JoinColumn(name = "individuo_id", nullable = false)
	private Individuo individuo;

	@Override
	public String toString() {
		return "Endereco [individuo=" + individuo + ", surrogateKey=" + surrogateKey + ", bairro=" + bairro + ", distrito=" + distrito
				+ ", codigoMunicipio=" + codigoMunicipio + ", estado=" + estado + ", cep=" + cep + ", caixaPostal="
				+ caixaPostal + ", pais=" + pais + ", tipo=" + tipo + ", dataInicio=" + dataInicio + ", dataFim="
				+ dataFim + "]";
	}

}

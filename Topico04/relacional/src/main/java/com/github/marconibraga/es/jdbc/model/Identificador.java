package com.github.marconibraga.es.jdbc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Identificador extends PersistentObject {

	@Column(unique = true, name = "surrogate_key")
	private String surrogateKey;
	private String designacao;
	private String area;
	private String emissor;
	private String data;
	private String tipo;

	@OneToOne(mappedBy = "identificador")
	private TituloEleitoral tituloEleitoral;

	@OneToOne(mappedBy = "identificador", fetch = FetchType.LAZY, targetEntity = Certidao.class)
	private Certidao certidao;

	@OneToOne(mappedBy = "identificador")
	private CTPS ctps;

	@ManyToOne
	@JoinColumn(name = "individuo_id", nullable = false)
	private Individuo individuo;

	@Override
	public String toString() {
		return "Identificador [surrogateKey=" + surrogateKey + ", designacao=" + designacao + ", area=" + area
				+ ", emissor=" + emissor + ", data=" + data + ", tipo=" + tipo + ", tituloEleitoral=" + tituloEleitoral
				+ ", certidao=" + certidao + ", ctps=" + ctps + ", individuo=" + individuo.id + "]";
	}
	
	

}

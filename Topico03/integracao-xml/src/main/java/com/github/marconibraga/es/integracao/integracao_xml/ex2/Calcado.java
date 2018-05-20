package com.github.marconibraga.es.integracao.integracao_xml.ex2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)
@JsonSubTypes({ @JsonSubTypes.Type(name = "tenis", value = Tenis.class),
		@JsonSubTypes.Type(name = "sapato", value = Sapato.class) })
public class Calcado implements Serializable {

	private static final long serialVersionUID = -4551302159456438817L;
	private String marca;
	private float preco;

	public Calcado() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param marca
	 * @param preco
	 */
	public Calcado(String marca, float preco) {
		super();
		this.marca = marca;
		this.preco = preco;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Calcado [marca=" + marca + ", preco=" + preco + "]";
	}

}

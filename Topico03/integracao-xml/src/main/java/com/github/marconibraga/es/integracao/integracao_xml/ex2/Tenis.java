package com.github.marconibraga.es.integracao.integracao_xml.ex2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "tenis")
public class Tenis extends Calcado {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7393729586507641061L;
	private String esporte;

	public Tenis() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param marca
	 * @param preco
	 * @param esporte
	 */
	public Tenis(String marca, float preco, String esporte) {
		super(marca, preco);
		this.esporte = esporte;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	@Override
	public String toString() {
		return "Tenis [esporte=" + esporte + " -- " + super.toString() + " ]\n";
	}

}

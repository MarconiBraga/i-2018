package com.github.marconibraga.es.integracao.integracao_xml.ex2;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "sapato")
public class Sapato extends Calcado {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5423597008299469419L;
	private Cor cor;

	public Sapato() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param marca
	 * @param preco
	 * @param cor
	 */
	public Sapato(String marca, float preco, Cor cor) {
		super(marca, preco);
		this.cor = cor;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "Sapato [cor=" + cor + " -- " + super.toString() + " ]\n";
	}

}

package com.github.marconibraga.es.integracao.integracao_xml.ex2;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "cor")
public class Cor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6501671147751532815L;
	private int r;
	private int g;
	private int b;

	public Cor() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param r
	 * @param g
	 * @param b
	 */
	public Cor(int r, int g, int b) {
		super();
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public int getR() {
		return r;
	}

	public int getG() {
		return g;
	}

	public int getB() {
		return b;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void setG(int g) {
		this.g = g;
	}

	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Cor [r=" + r + ", g=" + g + ", b=" + b + "]";
	}
}

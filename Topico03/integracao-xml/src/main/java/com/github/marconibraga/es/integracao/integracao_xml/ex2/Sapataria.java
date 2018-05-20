package com.github.marconibraga.es.integracao.integracao_xml.ex2;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "sapataria")
public class Sapataria {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Calcado> calcados;

	public List<Calcado> getCalcados() {
		return calcados;
	}

	public void setCalcados(List<Calcado> calcados) {
		this.calcados = calcados;
	}

	@Override
	public String toString() {
		return "Sapataria [calcados=" + calcados + "]";
	}

}

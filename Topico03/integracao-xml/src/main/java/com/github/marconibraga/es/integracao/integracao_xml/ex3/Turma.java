package com.github.marconibraga.es.integracao.integracao_xml.ex3;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "turma")
public class Turma {

	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Estudante> estudantes;

	/**
	 * @return the estudantes
	 */
	public List<Estudante> getEstudantes() {
		return estudantes;
	}

	/**
	 * @param estudantes
	 *            the estudantes to set
	 */
	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}

	@Override
	public String toString() {
		return "Turma [estudantes=" + estudantes + "]";
	}

}

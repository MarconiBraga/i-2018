package com.github.marconibraga.es.integracao.integracao_xml.ex1;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "alunos")
public class AlunosXML implements Serializable {

	private static final long serialVersionUID = 7814603821986377182L;

	@JsonProperty
	@JacksonXmlElementWrapper(useWrapping = false)
	@JacksonXmlProperty(localName = "aluno")
	private List<Aluno> alunos;

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
}

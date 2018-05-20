package com.github.marconibraga.es.integracao.integracao_xml.ex4;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Nome {

	private String titulos;
	private String nomes;
	private String sobrenomes;
	private String sufixos;
	private boolean usoCondicional;
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Representacao> representacoes;
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Utilizacao> utilizacoes;

	public String getTitulos() {
		return titulos;
	}

	public String getNomes() {
		return nomes;
	}

	public String getSobrenomes() {
		return sobrenomes;
	}

	public String getSufixos() {
		return sufixos;
	}

	public boolean isUsoCondicional() {
		return usoCondicional;
	}

	public List<Representacao> getRepresentacoes() {
		return representacoes;
	}

	public List<Utilizacao> getUtilizacoes() {
		return utilizacoes;
	}

	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}

	public void setNomes(String nomes) {
		this.nomes = nomes;
	}

	public void setSobrenomes(String sobrenomes) {
		this.sobrenomes = sobrenomes;
	}

	public void setSufixos(String sufixos) {
		this.sufixos = sufixos;
	}

	public void setUsoCondicional(boolean usoCondicional) {
		this.usoCondicional = usoCondicional;
	}

	public void setRepresentacoes(List<Representacao> representacoes) {
		this.representacoes = representacoes;
	}

	public void setUtilizacoes(List<Utilizacao> utilizacoes) {
		this.utilizacoes = utilizacoes;
	}
}

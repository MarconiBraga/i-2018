package com.github.marconibraga.es.integracao.integracao_xml.ex4;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "individuo")
public class Individuo {

	private int surrogateKey;
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Nome> nomes;
	private DadoDemografico dadoDemografico;
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Endereco> enderecos;
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Identificador> indentificadores;
	@JacksonXmlElementWrapper(useWrapping = false)
	private List<Vinculo> vinculos;

	public int getSurrogateKey() {
		return surrogateKey;
	}

	public List<Nome> getNomes() {
		return nomes;
	}

	public DadoDemografico getDadoDemografico() {
		return dadoDemografico;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public List<Identificador> getIndentificadores() {
		return indentificadores;
	}

	public void setSurrogateKey(int surrogateKey) {
		this.surrogateKey = surrogateKey;
	}

	public void setNomes(List<Nome> nomes) {
		this.nomes = nomes;
	}

	public void setDadoDemografico(DadoDemografico dadoDemografico) {
		this.dadoDemografico = dadoDemografico;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public void setIndentificadores(List<Identificador> indentificadores) {
		this.indentificadores = indentificadores;
	}

	public List<Vinculo> getVinculos() {
		return vinculos;
	}

	public void setVinculos(List<Vinculo> vinculos) {
		this.vinculos = vinculos;
	}

	@Override
	public String toString() {
		return "Individuo [surrogateKey=" + surrogateKey + ", nomes=" + nomes + ", dadoDemografico=" + dadoDemografico
				+ ", enderecos=" + enderecos + ", indentificadores=" + indentificadores + ", vinculos=" + vinculos
				+ "]";
	}

}

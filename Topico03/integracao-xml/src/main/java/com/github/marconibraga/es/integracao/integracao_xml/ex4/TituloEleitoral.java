package com.github.marconibraga.es.integracao.integracao_xml.ex4;

public class TituloEleitoral {

	private Identificador identificador;
	private String secao;
	private String zona;

	public Identificador getIdentificador() {
		return identificador;
	}

	public String getSecao() {
		return secao;
	}

	public String getZona() {
		return zona;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	public void setSecao(String secao) {
		this.secao = secao;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

}

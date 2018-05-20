package com.github.marconibraga.es.integracao.integracao_xml.ex4;

public class Identificador {

	private String surrogateKey;
	private String designacao;
	private String area;
	private String emissor;
	private String data;
	private String tipo;
	private TituloEleitoral tituloEleitoral;
	private Certidao certidao;
	private CTPS ctps;

	public String getSurrogateKey() {
		return surrogateKey;
	}

	public String getDesignacao() {
		return designacao;
	}

	public String getArea() {
		return area;
	}

	public String getEmissor() {
		return emissor;
	}

	public String getData() {
		return data;
	}

	public String getTipo() {
		return tipo;
	}

	public TituloEleitoral getTituloEleitoral() {
		return tituloEleitoral;
	}

	public Certidao getCertidao() {
		return certidao;
	}

	public CTPS getCtps() {
		return ctps;
	}

	public void setSurrogateKey(String surrogateKey) {
		this.surrogateKey = surrogateKey;
	}

	public void setDesignacao(String designacao) {
		this.designacao = designacao;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setTituloEleitoral(TituloEleitoral tituloEleitoral) {
		this.tituloEleitoral = tituloEleitoral;
	}

	public void setCertidao(Certidao certidao) {
		this.certidao = certidao;
	}

	public void setCtps(CTPS ctps) {
		this.ctps = ctps;
	}

}

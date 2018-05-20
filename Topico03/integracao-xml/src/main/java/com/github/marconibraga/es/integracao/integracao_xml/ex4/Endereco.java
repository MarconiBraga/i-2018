package com.github.marconibraga.es.integracao.integracao_xml.ex4;

public class Endereco {

	private String surrogateKey;
	private String bairro;
	private String distrito;
	private String codigoMunicipio;
	private String estado;
	private String cep;
	private String caixaPostal;
	private String pais;
	private String tipo;
	private Data dataInicio;
	private Data dataFim;
	private LinhaEndereco linhaEndereco;

	public String getSurrogateKey() {
		return surrogateKey;
	}

	public String getBairro() {
		return bairro;
	}

	public String getDistrito() {
		return distrito;
	}

	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}

	public String getEstado() {
		return estado;
	}

	public String getCep() {
		return cep;
	}

	public String getCaixaPostal() {
		return caixaPostal;
	}

	public String getPais() {
		return pais;
	}

	public String getTipo() {
		return tipo;
	}

	public Data getDataInicio() {
		return dataInicio;
	}

	public Data getDataFim() {
		return dataFim;
	}

	public LinhaEndereco getLinhaEndereco() {
		return linhaEndereco;
	}

	public void setSurrogateKey(String surrogateKey) {
		this.surrogateKey = surrogateKey;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public void setCodigoMunicipio(String codigoMunicipio) {
		this.codigoMunicipio = codigoMunicipio;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setCaixaPostal(String caixaPostal) {
		this.caixaPostal = caixaPostal;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDataInicio(Data dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataFim(Data dataFim) {
		this.dataFim = dataFim;
	}

	public void setLinhaEndereco(LinhaEndereco linhaEndereco) {
		this.linhaEndereco = linhaEndereco;
	}
}

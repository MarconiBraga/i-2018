package com.github.marconibraga.es.integracao.integracao_xml.ex3;

public class Endereco {

	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;

	public Endereco() {
	}

	/**
	 * @param cep
	 * @param logradouro
	 * @param numero
	 * @param complemento
	 */
	public Endereco(String cep, String logradouro, String numero, String complemento) {
		super();
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}

	/**
	 * @return the cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * @return the logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param cep
	 *            the cep to set
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * @param logradouro
	 *            the logradouro to set
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @param complemento
	 *            the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento="
				+ complemento + "]";
	}

}

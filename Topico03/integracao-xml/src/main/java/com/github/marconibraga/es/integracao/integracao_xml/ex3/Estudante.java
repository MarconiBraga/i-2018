package com.github.marconibraga.es.integracao.integracao_xml.ex3;

public class Estudante {

	private String nome;
	private Endereco endereco;

	public Estudante() {
	}

	/**
	 * @param nome
	 * @param endereco
	 */
	public Estudante(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	/**
	 * @return the endereco
	 */
	public Endereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", endereco=" + endereco + "]";
	}

}

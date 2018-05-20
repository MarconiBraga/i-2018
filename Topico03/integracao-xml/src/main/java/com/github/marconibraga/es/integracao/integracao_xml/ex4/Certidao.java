package com.github.marconibraga.es.integracao.integracao_xml.ex4;

public class Certidao {

	private Identificador identificador;
	private String tipo;
	private String cartorio;
	private String livro;
	private String folha;
	private String termo;

	public Identificador getIdentificador() {
		return identificador;
	}

	public String getTipo() {
		return tipo;
	}

	public String getCartorio() {
		return cartorio;
	}

	public String getLivro() {
		return livro;
	}

	public String getFolha() {
		return folha;
	}

	public String getTermo() {
		return termo;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}

	public void setLivro(String livro) {
		this.livro = livro;
	}

	public void setFolha(String folha) {
		this.folha = folha;
	}

	public void setTermo(String termo) {
		this.termo = termo;
	}

}

package com.github.marconibraga.es.integracao.integracao_xml.ex4;

import java.util.Date;

public class Utilizacao {

	private String uso;
	private Date dataInicial;
	private Date dataFinal;
	private Identificador identificador;

	public String getUso() {
		return uso;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public Identificador getIdentificador() {
		return identificador;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}

}

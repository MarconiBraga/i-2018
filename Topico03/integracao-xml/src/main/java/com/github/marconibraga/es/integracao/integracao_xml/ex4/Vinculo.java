package com.github.marconibraga.es.integracao.integracao_xml.ex4;

import java.util.Date;

public class Vinculo {

	private String relacionamento;
	private Date dataInicio;
	private Date dataFim;
	private Identificador identificador;

	public String getRelacionamento() {
		return relacionamento;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public Identificador getIdentificador() {
		return identificador;
	}

	public void setRelacionamento(String relacionamento) {
		this.relacionamento = relacionamento;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public void setIdentificador(Identificador identificador) {
		this.identificador = identificador;
	}
}

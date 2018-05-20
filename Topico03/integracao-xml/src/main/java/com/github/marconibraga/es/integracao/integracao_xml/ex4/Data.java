package com.github.marconibraga.es.integracao.integracao_xml.ex4;

import java.util.Date;

public class Data {

	private DadoDemografico dadoDemografico;
	private Date data;
	private String acuracia;

	public DadoDemografico getDadoDemografico() {
		return dadoDemografico;
	}

	public Date getData() {
		return data;
	}

	public String getAcuracia() {
		return acuracia;
	}

	public void setDadoDemografico(DadoDemografico dadoDemografico) {
		this.dadoDemografico = dadoDemografico;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public void setAcuracia(String acuracia) {
		this.acuracia = acuracia;
	}
}

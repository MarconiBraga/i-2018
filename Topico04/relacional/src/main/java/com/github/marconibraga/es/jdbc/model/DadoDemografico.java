package com.github.marconibraga.es.jdbc.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class DadoDemografico extends PersistentObject {

	private String sexo;
	private String nomeMae;
	private String nomePai;
	private String situacaoFamiliar;
	private String racaCor;
	private String comentario;
	private String fonteNotificacaoObito;
	private String nascimentoPluraridade;
	private String nascimentoOrigem;
	private String nascimentoSeguimento;
	
	@OneToOne
	private Individuo individuo;
	
	@OneToOne
	private Nacionalidade nacionalidade;
	
	@OneToOne(mappedBy = "dadoDemografico")
	private Data dataNascimento;
	
	@OneToOne(mappedBy = "dadoDemografico")
	private Data dataObito;

	@Override
	public String toString() {
		return "DadoDemografico [sexo=" + sexo + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", situacaoFamiliar="
				+ situacaoFamiliar + ", racaCor=" + racaCor + ", comentario=" + comentario + ", fonteNotificacaoObito="
				+ fonteNotificacaoObito + ", nascimentoPluraridade=" + nascimentoPluraridade + ", nascimentoOrigem="
				+ nascimentoOrigem + ", nascimentoSeguimento=" + nascimentoSeguimento + ", individuo=" + individuo
				+ ", nacionalidade=" + nacionalidade + ", dataNascimento=" + dataNascimento + ", dataObito=" + dataObito
				+ "]";
	}

}

package com.github.marconibraga.es.jdbc.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;

@lombok.Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class Data extends PersistentObject {

	@OneToOne(fetch = FetchType.LAZY)
	private DadoDemografico dadoDemografico;

	private Date data;
	private String acuracia;

	@Override
	public String toString() {
		return "Data [data=" + data + ", acuracia=" + acuracia + "]";
	}

}

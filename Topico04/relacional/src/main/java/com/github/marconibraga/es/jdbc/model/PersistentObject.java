package com.github.marconibraga.es.jdbc.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public abstract class PersistentObject {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
}

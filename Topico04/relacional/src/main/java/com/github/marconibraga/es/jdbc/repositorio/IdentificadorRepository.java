package com.github.marconibraga.es.jdbc.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.marconibraga.es.jdbc.model.Identificador;

@Repository
public interface IdentificadorRepository extends CrudRepository<Identificador, Long> {

	public List<Identificador> findByDesignacao(String designacao);

	public Identificador findBySurrogateKey(String surrogateKey);
	
	public List<Identificador> findByAreaIgnoreCaseContaining(String area);
}

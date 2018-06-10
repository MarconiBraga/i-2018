package com.github.marconibraga.es.jdbc.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.marconibraga.es.jdbc.model.Comunicacao;

@Repository
public interface ComunicacaoRepository extends CrudRepository<Comunicacao, Long> {

	public List<Comunicacao> findByMeio(String meio);
}

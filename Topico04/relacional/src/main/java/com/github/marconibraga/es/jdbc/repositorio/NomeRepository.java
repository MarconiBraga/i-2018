package com.github.marconibraga.es.jdbc.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.marconibraga.es.jdbc.model.Nome;

@Repository
public interface NomeRepository extends CrudRepository<Nome, Long> {

	public List<Nome> findByNomesIgnoreCaseContaining(String nome);
	
	public List<Nome> findByRepresentacoes_AlternativaIgnoreCaseContaining(String nome);
	
	public List<Nome> findByUtilizacoes_UsoIgnoreCaseContaining(String uso);
}

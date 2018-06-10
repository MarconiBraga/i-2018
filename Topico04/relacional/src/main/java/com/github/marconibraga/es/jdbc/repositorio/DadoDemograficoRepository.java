package com.github.marconibraga.es.jdbc.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.marconibraga.es.jdbc.model.DadoDemografico;

@Repository
public interface DadoDemograficoRepository extends CrudRepository<DadoDemografico, Long> {

	public List<DadoDemografico> findBySexo(String sexo);

	public List<DadoDemografico> findByNomeMaeIgnoreCaseContaining(String mae);

	public List<DadoDemografico> findByNomePaiIgnoreCaseContaining(String pai);
}

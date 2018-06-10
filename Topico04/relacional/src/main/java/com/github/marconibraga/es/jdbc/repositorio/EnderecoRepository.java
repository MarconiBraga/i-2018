package com.github.marconibraga.es.jdbc.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.marconibraga.es.jdbc.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {

	public List<Endereco> findByCep(String cep);
	
	public List<Endereco> findByCodigoMunicipio(String cep);
}

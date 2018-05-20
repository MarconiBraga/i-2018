/**
 * 
 */
package com.github.marconibraga.es.integracao.integracao_xml.ex3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Aplicação responsável por criar uma instancia de Turma e serializa-la em um
 * arquivo xml
 * 
 * @author Marconi Braga
 *
 */
public class AppUm {

	public static void main(String[] args) throws Exception {

		Turma turma = criaTurma();

		XmlMapper xmlMapper = new XmlMapper();
		OutputStream outputStream = new FileOutputStream(new File("turma.xml"));

		xmlMapper.writeValue(outputStream, turma);
		outputStream.close();

	}

	/**
	 * Faz o mock do objeto {@link Turma} e cria sua lista de {@link Estudante}
	 * 
	 * @return {@link Turma}
	 */
	private static Turma criaTurma() {
		Turma turma = new Turma();
		turma.setEstudantes(new ArrayList<>());
		turma.getEstudantes()
				.add(new Estudante("Joao Silva", new Endereco("74123233", "Rua xyz", "20", "Em frente da praca")));
		turma.getEstudantes().add(
				new Estudante("Roberto Braga", new Endereco("74568987", "Rua abc", "21", "Em frente da farmacia")));
		turma.getEstudantes()
				.add(new Estudante("Maria Rita", new Endereco("74569843", "Rua efg", "85", "Em frente da padaria")));
		turma.getEstudantes()
				.add(new Estudante("Zé do Java", new Endereco("74336548", "Rua sha", "66", "Atras da praca")));
		turma.getEstudantes()
				.add(new Estudante("Carol Silva", new Endereco("74561235", "Rua 22", "1", "Casa amarela")));

		return turma;
	}

}

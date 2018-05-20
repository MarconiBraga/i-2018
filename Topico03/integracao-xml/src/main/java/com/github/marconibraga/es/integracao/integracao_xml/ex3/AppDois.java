/**
 * 
 */
package com.github.marconibraga.es.integracao.integracao_xml.ex3;

import java.io.FileInputStream;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Aplicação responsável por obter uma instancia de Turma a partir de uma
 * deserialização de um xml
 * 
 * @author Marconi Braga
 *
 */
public class AppDois {

	/**
	 * 
	 * @param args[0]
	 *            caminho do arquivo xml a ser lido
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		String caminhoArquivo = args[0];

		XmlMapper xmlMapper = new XmlMapper();

		Turma turma = xmlMapper.readValue(new FileInputStream(caminhoArquivo), Turma.class);

		System.out.println(turma);

	}

}

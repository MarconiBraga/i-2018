package com.github.marconibraga.es.integracao.integracao_xml.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * <b>Exercicio 1</b> Classe responsavel por gerar um arquivo xml, serializando
 * os objetos contindos no arquivo csv
 * 
 * 
 * @author Marconi Braga
 *
 */
public class ExercicioUm {

	/**
	 * 
	 * @param args[0] caminho do arquivo csv
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		AlunosXML alunosXML = new AlunosXML();
		String caminhoArquivo = args[0];

		List<Aluno> alunos = processeArquivo(caminhoArquivo);

		alunosXML.setAlunos(alunos);
		XmlMapper xmlMapper = new XmlMapper();
		OutputStream outputStream = new FileOutputStream(new File("teste-xml.xml"));

		xmlMapper.writeValue(outputStream, alunosXML);
		outputStream.close();

	}

	/**
	 * Processa o arquivo csv populando uma lista de {@link Aluno} para cada linha
	 * contida neste
	 * 
	 * @param caminhoArquivo
	 * @return
	 * @throws IOException
	 */
	private static List<Aluno> processeArquivo(String caminhoArquivo) throws IOException {
		List<Aluno> alunos = new ArrayList<Aluno>();

		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(caminhoArquivo)));
		String linha = null;
		while ((linha = reader.readLine()) != null) {
			String[] campos = linha.split(";");
			System.out.println(Arrays.toString(campos));
			alunos.add(new Aluno(campos[0], campos[1]));
		}
		reader.close();
		return alunos;
	}

}

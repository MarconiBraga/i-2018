package com.github.marconibraga.es.integracao.integracao_xml.ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * <b>Exercicio 4</b>
 * 
 * Pesando no reaproveitamento da classe, esta implementação possui um dinamismo
 * quanto a qual classe sera serializada e deserializada, de acordo com os
 * parametros, bastanto implementar a instancia que for preciso.
 * 
 * 
 * @author Marconi Braga
 *
 */
public class ExercicioQuatro {

	/**
	 * 
	 * @param args[0]
	 *            - tipo de operacao 1 ou 2, 1 para serializacao em xml e 2 para
	 *            desearialização do xml
	 * @param args[1]
	 *            - nome da classe em questão
	 * @param args[2]
	 *            - caminho do arquivo a ser lido/gravado
	 */

	public static void main(String[] args) {

		try {
			String tipoOperacao = args[0];
			String nomeClasse = args[1];
			String caminhoDoArquivo = args[2];

			Class<?> classe;
			classe = Class.forName(ExercicioQuatro.class.getPackage().getName() + "." + nomeClasse);
			switch (tipoOperacao) {
			case "1":
				serializeParaXML(classe, caminhoDoArquivo);
				break;
			case "2":
				deserilizeParaClasse(classe, caminhoDoArquivo);
				break;
			default:
				System.out.println("Operação não valida");
				break;
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Classe não encontrada");
			e.printStackTrace();
			System.exit(0);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Parametro informado incorreto ('Tipo Operacao' 'Nome da Classe' 'Caminho do arquivo')");
			e.printStackTrace();
			System.exit(0);
		}

	}

	/**
	 * Deserializa o arquivo xml para a classe passada como argumento, mostrando no
	 * console
	 * 
	 * @param classe
	 * @param caminhoDoArquivo
	 */
	private static void deserilizeParaClasse(Class<?> classe, String caminhoDoArquivo) {
		XmlMapper xmlMapper = new XmlMapper();

		Object object;
		try {
			object = xmlMapper.readValue(new FileInputStream(caminhoDoArquivo), classe);
			System.out.println(object);
		} catch (Exception e) {
			System.out.println("Erro ao ler arquivo");
			e.printStackTrace();
		}
	}

	/**
	 * Serializa uma instacia do tipo da classe que foi passada como parametro, e
	 * salva no caminho especificado
	 * 
	 * @param classe
	 * @param caminhoDoArquivo
	 */
	private static void serializeParaXML(Class<?> classe, String caminhoDoArquivo) {
		XmlMapper xmlMapper = new XmlMapper();
		try {
			Object object = mockInstancia(classe);
			OutputStream outputStream = new FileOutputStream(new File(caminhoDoArquivo));
			xmlMapper.writeValue(outputStream, object);
			outputStream.close();

		} catch (Exception e) {
			System.out.println("Erro ao gerar xml");
			e.printStackTrace();
		}
	}

	/**
	 * Realiza o mock da instacia do tipo da classe passada como parametro
	 * 
	 * @param classe
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	private static Object mockInstancia(Class<?> classe) throws InstantiationException, IllegalAccessException {

		if (classe.getName().equals(Individuo.class.getName())) {
			Individuo individuo = new Individuo();
			individuo.setSurrogateKey(10);

			Identificador identificador = new Identificador();
			identificador.setArea("200");

			Identificador identificador2 = new Identificador();
			identificador2.setArea("222");

			Vinculo vinculo = new Vinculo();
			vinculo.setIdentificador(identificador);
			vinculo.setDataFim(new Date());

			individuo.setVinculos(Arrays.asList(vinculo));
			individuo.setIndentificadores(Arrays.asList(identificador, identificador2));
			return individuo;
		}
		return null;
	}

}

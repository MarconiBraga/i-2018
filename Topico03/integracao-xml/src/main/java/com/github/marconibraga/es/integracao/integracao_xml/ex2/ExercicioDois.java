package com.github.marconibraga.es.integracao.integracao_xml.ex2;

import java.io.FileInputStream;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * 
 * <b>Exercício 2</b>
 * 
 * Classe responsavel por deserializar um arquivo xml em uma lista de {@link Calcado}
 * com herancas para as classes {@link Tenis} e {@link Sapato}
 * 
 * Devido a uma limitação do Jackson XML comforme mencionado na issue: 
 * <a>https://github.com/FasterXML/jackson-dataformat-xml/issues/178</a> 
 * é necessário uma redundância quanto a lista de Calcados, ou seja, a estrutura deverá
 * ficar da seguinte forma:
 *	<sapataria>
 *		<calcados>
 *			<tenis><marca>nike</marca><preco>20.0</preco><esporte>corrida</esporte></tenis>
 *		</calcados>
 *		<calcados>
 *			<sapato><marca>marcaX</marca><preco>20.0</preco><cor><r>22</r><g>21</g><b>20</b></cor></sapato>
 *		</calcados>
 *		<calcados>
 *			<tenis><marca>a</marca><preco>20.0</preco><esporte>corrida</esporte></tenis>
 *		</calcados>
 *	</sapataria>
 * 
 * 
 * @author Marconi Braga
 *
 */
public class ExercicioDois {

	/**
	 * 
	 * @param args 1 - caminho do arquivo xml da sapataria
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		String caminhoArquivo = args[0];

		XmlMapper xmlMapper = new XmlMapper();

		Sapataria sapataria = xmlMapper.readValue(new FileInputStream(caminhoArquivo), Sapataria.class);

		System.out.println(sapataria);

	}

}

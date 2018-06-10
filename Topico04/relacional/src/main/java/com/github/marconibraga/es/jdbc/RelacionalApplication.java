package com.github.marconibraga.es.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.github.marconibraga.es.jdbc.model.DadoDemografico;
import com.github.marconibraga.es.jdbc.model.Identificador;
import com.github.marconibraga.es.jdbc.model.Nome;
import com.github.marconibraga.es.jdbc.repositorio.ComunicacaoRepository;
import com.github.marconibraga.es.jdbc.repositorio.DadoDemograficoRepository;
import com.github.marconibraga.es.jdbc.repositorio.EnderecoRepository;
import com.github.marconibraga.es.jdbc.repositorio.IdentificadorRepository;
import com.github.marconibraga.es.jdbc.repositorio.NomeRepository;

@SpringBootApplication
@ComponentScan(basePackages = "com.github.marconibraga.jdbc")
public class RelacionalApplication implements CommandLineRunner {

	@Autowired
	private IdentificadorRepository identificadorRepository;

	@Autowired
	private NomeRepository nomeRepository;

	@Autowired
	private DadoDemograficoRepository dadoDemograficoRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Autowired
	private ComunicacaoRepository comunicacaoRepository;

	public static void main(String[] args) {
		SpringApplication.run(RelacionalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		mostraTelaPrincipal(scanner);
	}

	/**
	 * Tela principal para grupo de pesquisas
	 * 
	 * @param scanner
	 */
	private void mostraTelaPrincipal(Scanner scanner) {
		System.out.println("########################   Identificação de pacientes   ########################");
		System.out.println("Digite a opção desejada para consulta:");
		System.out.println("1 - Indentificadores");
		System.out.println("2 - Nomes");
		System.out.println("3 - Dados demográficos");
		System.out.println("4 - Endereços");
		System.out.println("5 - Comunicações Telefonicas");

		String opcao = scanner.nextLine();
		switch (opcao) {
		case "1":
			telaPesquisaIdentificadores(scanner);
			break;
		case "2":
			telaPesquisaNomes(scanner);
			break;
		case "3":
			telaPesquisaDadosDemograficos(scanner);
			break;
		case "4":
			telaPesquisaEnderecos(scanner);
			break;
		case "5":
			telaPequisaComunicacoesTelefonicas(scanner);
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}
	}

	/**
	 * Tela responsável pela lógica de pesquisa de comunicações telefonicas
	 * 
	 * @param scanner
	 */
	private void telaPequisaComunicacoesTelefonicas(Scanner scanner) {
		System.out.println("########################  Pesquisa Comunicações Telefonicas  ########################");
		System.out.println("Digite a opção desejada para consulta:");
		System.out.println("1 - Meio");
		System.out.println("0 - Menu Principal");
		String opcao = scanner.nextLine();
		System.out.println("Valor:");
		switch (opcao) {
		case "1":
			comunicacaoRepository.findByMeio(scanner.nextLine()).forEach(x -> System.out.println(x));
			telaPequisaComunicacoesTelefonicas(scanner);
			break;
		case "0":
			mostraTelaPrincipal(scanner);
			break;
		default:
			telaPequisaComunicacoesTelefonicas(scanner);
			break;
		}
	}

	/**
	 * Tela responsável pela lógica de pesquisa de Endereços
	 * 
	 * @param scanner
	 */
	private void telaPesquisaEnderecos(Scanner scanner) {
		System.out.println("########################  Pesquisa Endereços  ########################");
		System.out.println("Digite a opção desejada para consulta:");
		System.out.println("1 - CEP");
		System.out.println("2 - Código Cidade");
		System.out.println("0 - Menu Principal");
		String opcao = scanner.nextLine();
		System.out.println("Valor:");
		switch (opcao) {
		case "1":
			enderecoRepository.findByCep(scanner.nextLine()).forEach(x -> System.out.println(x));
			telaPesquisaEnderecos(scanner);
			break;
		case "2":
			enderecoRepository.findByCodigoMunicipio(scanner.nextLine()).forEach(x -> System.out.println(x));
			telaPesquisaEnderecos(scanner);
			break;
		case "0":
			mostraTelaPrincipal(scanner);
			break;
		default:
			telaPesquisaEnderecos(scanner);
			break;
		}

	}

	/***
	 * Tela responsável pela lógica de pesquisa de Dados Demográficos
	 * 
	 * @param scanner
	 */
	private void telaPesquisaDadosDemograficos(Scanner scanner) {
		System.out.println("########################  Pesquisa Dados Demográficos   ########################");
		System.out.println("Digite a opção desejada para consulta:");
		System.out.println("1 - Nome Mãe");
		System.out.println("2 - Nome Pai");
		System.out.println("3 - Sexo (M/F/I/U)");
		System.out.println("0 - Menu Principal");
		String opcao = scanner.nextLine();
		System.out.println("Valor:");
		switch (opcao) {
		case "1":
			List<DadoDemografico> listMae = dadoDemograficoRepository
					.findByNomeMaeIgnoreCaseContaining("%" + scanner.nextLine() + "%");
			listMae.forEach(x -> System.out.println(x));
			telaPesquisaDadosDemograficos(scanner);
			break;
		case "2":
			List<DadoDemografico> listpai = dadoDemograficoRepository
					.findByNomePaiIgnoreCaseContaining("%" + scanner.nextLine() + "%");
			listpai.forEach(x -> System.out.println(x));
			telaPesquisaDadosDemograficos(scanner);
			break;
		case "3":
			List<DadoDemografico> list = dadoDemograficoRepository.findBySexo(scanner.nextLine());
			list.forEach(x -> System.out.println(x));
			telaPesquisaDadosDemograficos(scanner);
			break;
		case "0":
			mostraTelaPrincipal(scanner);
			break;
		default:
			telaPesquisaDadosDemograficos(scanner);
			break;
		}

	}

	/**
	 * Tela responsável pela lógica de pesquisa de Identificadores
	 * 
	 * @param scanner
	 */
	private void telaPesquisaIdentificadores(Scanner scanner) {
		System.out.println("########################  Pesquisa Indentificadores   ########################");
		System.out.println("Digite a opção desejada para consulta:");
		System.out.println("1 - Designação");
		System.out.println("2 - Área geográfica");
		System.out.println("3 - Surrogate Key");
		System.out.println("0 - Menu Principal");
		String opcao = scanner.nextLine();
		System.out.println("Valor:");
		switch (opcao) {
		case "1":
			System.out.println(identificadorRepository.findByDesignacao(scanner.nextLine()));
			telaPesquisaIdentificadores(scanner);
			break;
		case "2":
			List<Identificador> list = identificadorRepository
					.findByAreaIgnoreCaseContaining("%" + scanner.nextLine() + "%");
			list.forEach(x -> System.out.println(x));
			telaPesquisaIdentificadores(scanner);
			break;
		case "3":
			System.out.println(identificadorRepository.findBySurrogateKey(scanner.nextLine()));
			telaPesquisaIdentificadores(scanner);
			break;
		case "0":
			mostraTelaPrincipal(scanner);
			break;
		default:
			telaPesquisaIdentificadores(scanner);
			break;
		}
	}

	/**
	 * Tela responsável pela lógica de pesquisa de Nomes
	 * 
	 * @param scanner
	 */
	private void telaPesquisaNomes(Scanner scanner) {
		System.out.println("########################  Pesquisa Nomes   ########################");
		System.out.println("Digite a opção desejada para consulta:");
		System.out.println("1 - Nome");
		System.out.println("2 - Representacao");
		System.out.println("3 - Uso");
		System.out.println("0 - Menu Principal");
		String opcao = scanner.nextLine();
		System.out.println("Valor:");
		switch (opcao) {
		case "1":
			List<Nome> list = nomeRepository.findByNomesIgnoreCaseContaining("%" + scanner.nextLine() + "%");
			list.forEach(x -> System.out.println(x));
			telaPesquisaNomes(scanner);
			break;
		case "2":
			nomeRepository.findByRepresentacoes_AlternativaIgnoreCaseContaining("%" + scanner.nextLine() + "%")
					.forEach(x -> System.out.println(x));
			telaPesquisaNomes(scanner);
			break;
		case "3":
			nomeRepository.findByUtilizacoes_UsoIgnoreCaseContaining("%" + scanner.nextLine() + "%")
					.forEach(x -> System.out.println(x));
			telaPesquisaNomes(scanner);
			break;
		case "0":
			mostraTelaPrincipal(scanner);
			break;
		default:
			telaPesquisaNomes(scanner);
			break;
		}
	}
}

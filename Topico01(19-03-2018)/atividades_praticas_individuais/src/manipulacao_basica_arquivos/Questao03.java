package manipulacao_basica_arquivos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) throws IOException {
	    System.out.println("Escreva o caminho do arquivo(UTF-8)");
	    Scanner scanner = new Scanner(System.in);
	    String path = scanner.next();
	    Path caminho_arquivo = Paths.get(path);
	    for(String line : Files.readAllLines(caminho_arquivo, Charset.forName("UTF-8"))){
	        System.out.println(line);
        }
    }
}
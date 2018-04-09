package manipulacao_basica_arquivos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    System.out.println("Escreva o caminho do arquivo(UTF-8)");
	    Scanner scanner = new Scanner(System.in);
	    String path = scanner.next();
	    Path caminho = Paths.get(path);
	    for(String linha : Files.readAllLines(caminho, Charset.forName("UTF-8"))){
	        System.out.println(linha);
        }
    }
}
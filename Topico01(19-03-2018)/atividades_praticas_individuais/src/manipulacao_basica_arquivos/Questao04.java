package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) throws IOException {
        System.out.println("Digite o caminho e o texto(UTF-8)");
        Scanner scanner = new Scanner(System.in);
		
        String path = scanner.nextLine();
        Path caminho_arquivo = Paths.get(path);
        
		System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();
        
		PrintWriter pw = new PrintWriter(path, "UTF-8");
        pw.write(texto);
        pw.close();
        for(String line : Files.readAllLines(caminho_arquivo, Charset.forName("UTF-8"))) {
            System.out.println(line);
        }
    }
}
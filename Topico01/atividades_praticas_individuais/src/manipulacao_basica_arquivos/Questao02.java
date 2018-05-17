package manipulacao_basica_arquivos;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) throws IOException {
        System.out.println("Digite o nome e caminho do arquivo: ");
        Scanner scanner = new Scanner(System.in);
        String caminho_arquivo = scanner.next();
        file_name(caminho_arquivo);
    
        FileInputStream arquivo = new FileInputStream(caminho_arquivo);
        File file = new File(caminho_arquivo);
        DataInputStream leitor = new DataInputStream(arquivo);
		// "valor" refere-se ao valor de 4 bytes
        short valor = leitor.readShort();
        String begin = Integer.toHexString(valor & 0xffff);
        
        System.out.println(begin);
        Long tamanho_arquivo = file.length();
        leitor.skip(tamanho_arquivo-4);
        short valor_final = leitor.readShort();
		// "hex_final" refere-se ao valor final hexadecimal
        String hex_final = Integer.toHexString(valor_final & 0xffff);
        
        System.out.println(hex_final);
        leitor.close();
        if(begin.equals("ffd8") && hex_final.equals("ffd9")){
            System.out.println("É satisfeita!");
        }
        else{
            System.out.println("Não é satisfeita!");
        }
    }
}
package manipulacao_basica_arquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) throws IOException{
        System.out.println("Digite o nome do arquivo e seu caminho!");
        Scanner scanner = new Scanner(System.in);
        String caminho_arquivo = scanner.next();
        File(caminho_arquivo);
    }

    public static void File(String caminho_arquivo) throws IOException {
        FileInputStream arquivo = new FileInputStream(caminho_arquivo);
        DataInputStream leitor = new DataInputStream(arquivo);
        // "valor" refere-se ao valor de 4 bytes
		int valor = leitor.readInt();
        leitor.close();
        System.out.println(Integer.toHexString(valor));
    }

}

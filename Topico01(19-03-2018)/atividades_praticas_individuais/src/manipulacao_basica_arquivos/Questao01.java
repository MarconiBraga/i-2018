package manipulacao_basica_arquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) throws IOException{
        System.out.println("Digite o nome do arquivo a ser lido e seu caminho no sistema para que possa ser lido pelo programa");
        Scanner scanner = new Scanner(System.in);
        String caminhoDoArquivo = scanner.next();
        Arquivo4EmHexadecimal(caminhoDoArquivo);
    }

    public static void Arquivo4EmHexadecimal(String caminhoDoArquivo) throws IOException {
        FileInputStream arquivo = new FileInputStream(caminhoDoArquivo);
        DataInputStream leitor = new DataInputStream(arquivo);
        int valor4Bytes = leitor.readInt();
        leitor.close();
        System.out.println(Integer.toHexString(valor4Bytes));
    }

}

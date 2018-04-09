package manipulacao_basica_arquivos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) throws IOException{
        System.out.println("Digite o nome do arquivo e seu caminho!");
        Scanner scanner = new Scanner(System.in);
        String caminhoArquivo = scanner.next();
        File(caminhoArquivo);
    }

    public static void File(String caminhoArquivo) throws IOException {
        FileInputStream arquivo = new FileInputStream(caminhoArquivo);
        DataInputStream leitor = new DataInputStream(arquivo);
        int valor4Bytes = leitor.readInt();
        leitor.close();
        System.out.println(Integer.toHexString(valor4Bytes));
    }

}

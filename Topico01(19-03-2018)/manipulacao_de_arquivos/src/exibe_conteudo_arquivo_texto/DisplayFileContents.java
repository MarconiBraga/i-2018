package exibe_conteudo_arquivo_texto;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DisplayFileContents {

    public static void main(String[] args) throws IOException {
        Charset uft8 = Charset.forName("UTF-8");
        Path arquivo = Paths.get("/home/marconi/Faculdade/i-2018/Topico01(19-03-2018)/manipulacao_de_arquivos", "file.txt");
        for (String linha : Files.readAllLines(arquivo, uft8)) {
            System.out.println(linha);
        }

    }
}

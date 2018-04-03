package exibe_conteudo_arquivo_texto_alternativa;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DisplayFileContentsAlternative {

    public static void main(String[] args) throws IOException {

        Path arquivo = Paths.get("/user/name_user/i-2018/Topico01(19-03-2018)/manipulacao_de_arquivos", "file.txt");
        Charset utf8 = Charset.forName("UTF-8");
        BufferedReader br = Files.newBufferedReader(arquivo, utf8);

        String linha;
        while ((linha = br.readLine()) != null) {
            System.out.println(linha);
        }

    }
}

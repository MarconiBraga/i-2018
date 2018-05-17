package cria_arquivo_texto;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {

    public static void main(String[] args) throws IOException {

        String what_is_it = "Integração entre aplicações, sistemas e processos de negócio de uma organização, com o auxílio de serviços.";

        File file = new File ("/file.txt");
        PrintWriter printWriter = new PrintWriter ("file.txt", "UTF-8");
        printWriter.println (what_is_it);
        printWriter.close ();
    }
}
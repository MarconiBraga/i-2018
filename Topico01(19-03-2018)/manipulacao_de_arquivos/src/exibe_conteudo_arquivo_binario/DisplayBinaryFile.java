package exibe_conteudo_arquivo_binario;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DisplayBinaryFile {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("binaryFile");
        DataInputStream dis = new DataInputStream(fis);
        int valor = dis.readInt();
        dis.close();
        System.out.println(valor);

    }

}

package cria_arquivo_binario;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateBinaryFile {

    public static void main(String[] args) throws IOException {

        int inteiro = 20; //Exemplo

        FileOutputStream fos = new FileOutputStream("binaryFile");
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(inteiro);
        dos.close();

    }
}

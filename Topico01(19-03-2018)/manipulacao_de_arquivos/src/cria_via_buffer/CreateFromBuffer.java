package cria_via_buffer;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.AccessMode.WRITE;
import static java.nio.file.StandardOpenOption.CREATE;

public class CreateFromBuffer {

    public static void main(String[] args) throws IOException {

        Path arquivo = Paths.get("/user/name_user/i-2018/Topico01(19-03-2018)/manipulacao_de_arquivos", "file.txt");
        int valor = Integer.parseInt("20"); //Exemplo

        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.putInt(valor);
        buffer.flip();

        FileChannel fc = FileChannel.open(arquivo, CREATE, WRITE);
        fc.write(buffer);
        fc.close();

    }
}
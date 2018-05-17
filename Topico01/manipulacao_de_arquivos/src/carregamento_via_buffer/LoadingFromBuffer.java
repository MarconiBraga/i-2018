package carregamento_via_buffer;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static java.nio.file.AccessMode.READ;

public class LoadingFromBuffer {

    public static void main(String[] args) throws IOException {
        Path arquivo = Paths.get(caminho_arquivo, "example.txt");
        ByteBuffer buffer = ByteBuffer.allocate(10);
        FileChannel fc = FileChannel.open(arquivo, READ);
        fc.read(buffer);
        fc.close();
        buffer.flip();
        int valor = buffer.getInt();
        System.out.println(valor);
    }

}

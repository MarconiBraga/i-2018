import java.io.*;

public class Serialize {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Marconi Braga";
        e.address = "Rua Esmeralda, Av.3 Jardim Goiás";
        e.CPF = 03231437560;
        e.number = 101;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Foi salvo em /tmp/employee.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
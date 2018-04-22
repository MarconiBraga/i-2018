import java.io.*;

public class Deserialize {
    public static void main(String[] args) {
        Employee e = null;
        try {
            FileInputStream fileIn = new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Classe Employee não encontrada!");
            c.printStackTrace();
            return;
        }
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("CPF: " + e.CPF);
        System.out.println("Number: " + e.number);
    }
}
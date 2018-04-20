package gerar_obter_valor_json;

import java.io.IOException;
import com.google.gson.Gson;

public class Principal {

    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();

// toJson
        System.out.println(gson.toJson(21));
        System.out.println(gson.toJson(true));
        System.out.println(gson.toJson(new Integer(-57)));
        System.out.println(gson.toJson("hoje"));

// fromJson
        System.out.println(gson.fromJson("\"hoje\"", String.class));
        System.out.println(gson.fromJson("100", Integer.class));

    }
}

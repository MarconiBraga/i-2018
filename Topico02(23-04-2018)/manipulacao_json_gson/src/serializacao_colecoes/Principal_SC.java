package serializacao_colecoes;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Principal_SC {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(34);
        numeros.add(23);

        Gson gson = new Gson();

        // toJson
        String json = gson.toJson(numeros);
        System.out.println(json);

        // fromJson
        Type listaType = new TypeToken<List<Integer>>() {
        }.getType();
        List<Integer> recuperado = gson.fromJson(json, listaType);

        System.out.println(recuperado);
    }
}

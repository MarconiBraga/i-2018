package serializacao_vetor;

import com.google.gson.Gson;

public class Principal_SV {

    public class Vetor {
        public static void main(String[] args) {
            Gson gson = new Gson();

            String json = gson.toJson(new UmVetor());
            System.out.println(json);

            UmVetor obj = gson.fromJson(json, UmVetor.class);
            System.out.println(obj.nome);
            System.out.println(obj.logicos[0]);
        }
    }

    class UmVetor {
        String nome = "UmVetor";
        boolean[] logicos = { true, false, false, true };
    }


}

package serializacao_objeto;

import com.google.gson.Gson;

public class Principal_SO {

    public static void main(String[] args) {
        Gson gson = new Gson();

        // toJson
        String json = gson.toJson(new Exemplo(-4, "Exemplo"));

        // fromJson
        Exemplo tst = gson.fromJson(json, Exemplo.class);
        System.out.println(json);
        System.out.println(tst.getValor() + " " + tst.getTexto());
    }

    class Exemplo {
        private int valor;
        private String texto;

        public Exemplo(int v, String str) {
            valor = v;
            texto = str;
        }

        public int getValor() {
            return valor;
        }

        public String getTexto() {
            return texto;
        }
    }

}


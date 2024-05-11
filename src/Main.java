import com.google.gson.Gson;

import java.util.*;

public class Main extends Titulo {



    public static void main(String[] args) {

        Titulo novoTitulo = new Main();
        Titulo novoTitulo2 = new Main();
        Titulo novoTitulo3 = new Main();
        novoTitulo.setNome("Andre");
        novoTitulo2.setNome("Taty");
        novoTitulo3.setNome("Pedro");

        ArrayList<Integer> numerosInteiros = new ArrayList<>();

        Integer[] numeros = {9,3,8,6,5,2,1,4,7,10};
        numerosInteiros.addAll(Arrays.asList(numeros));
        System.out.println(numerosInteiros);
        Collections.sort(numerosInteiros);
        System.out.println(numerosInteiros);

        ArrayList<Titulo> nomes = new ArrayList<>();
        nomes.add(novoTitulo);
        nomes.add(novoTitulo2);
        nomes.add(novoTitulo3);
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);

        for (Titulo nome: nomes) {
            System.out.println(nome.equals("Andre"));
        }

        String jsonPessoa = "{\"nome\":\"Rodrigo\",\"idade\"20,\"cidade\";\"São Paulo\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto pessoa: " + pessoa);










    }
}



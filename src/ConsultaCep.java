import com.google.gson.Gson;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaCep {

    public Endereco buscaEndereco() {
        Scanner scanner = new Scanner(System.in);
        String cep;

        System.out.println("Digite o cep da busca:");
        cep = scanner.nextLine();

        String endereco = "https://viacep.com.br/ws/" + cep + "/json";

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response;
        try {
            HttpClient client = HttpClient.newHttpClient();
            response = client.send
                    (request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir do cep" + cep);
        }

    }
}








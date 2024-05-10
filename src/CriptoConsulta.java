import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class CriptoConsulta {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite a sua criptomoeda:");
        var consulta = leitura.nextLine();
        String[] palavra = consulta.split("\\s+");
        String palavrajunta = String.join("", palavra);

        String chave = "Cghuhkughkhk";

        String endereco = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&ids="+palavrajunta+"&x_cg_demo_api_key="+chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}

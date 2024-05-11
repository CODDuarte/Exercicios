import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Scanner;

public class BuscaCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cep = new ArrayList<>();
        String busca = "";


        while (!busca.equalsIgnoreCase("Sair")) {

            System.out.println("Digite o cep da rua");
            busca = scanner.nextLine();
            if (busca.equalsIgnoreCase("Sair"))
                break;
            cep.add(busca);
            System.out.println(cep);
            String endereco = "https://viacep.com.br/ws/" + busca + "/json/";
            System.out.println(endereco);


            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco)).build();

            try {
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() == 200) {
                    System.out.println("Endereço encontrado:");
                    System.out.println(response.body());

                } else {
                    System.out.println("Erro ao buscar o endereço. Código der status: " + response.statusCode());
                }

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}

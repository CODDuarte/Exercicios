import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class LivrariaComConsulta {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Dígite o titulo do livro");
        String tituloLivro = leitura.nextLine();
        String[] palavra = tituloLivro.split("\\s+");
        String palavraJunta = String.join("", palavra);
        ApiKey apiKeyLivraria = new ApiKey();


        String chave = apiKeyLivraria.getApiKeyLivraria();
        String endereco = "https://www.googleapis.com/books/v1/volumes?q="+palavraJunta+":keyes&key="+chave;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String>  response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());




    }
}

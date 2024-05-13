import java.io.IOException;

public class BuscaCep {
    public static void main(String[] args)  {

        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco();
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }

    }


}

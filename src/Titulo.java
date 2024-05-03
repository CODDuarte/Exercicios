import java.util.Objects;

public class Titulo implements Comparable<Titulo>  {
    String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "nome='" + nome + '\'' +
                '}';
    }
}

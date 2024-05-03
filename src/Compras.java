public class Compras implements Comparable<Compras> {
    private String nome;
    private double valor;

    public Compras(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto - " + nome + ", valor - R$" + valor;


    }

    @Override
    public int compareTo(Compras outraCompra) {
        return Double.compare(this.valor, outraCompra.valor);
    }
}

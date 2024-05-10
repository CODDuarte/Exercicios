import java.util.ArrayList;
import java.util.Scanner;

public class Banco {

    private double limite = 1000;
    private double  saldo = limite;
    private ArrayList<Banco> compras = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Banco(String item, double valor) {
    }


    double cartaoDeCredito () {
        double calcularSaldo = limite - saldo;
        return saldo;
    }

    private void fazerCompra (String item, double valor) {
        System.out.println("Digite o nome do produto: ");
        item = scanner.next();
        System.out.println("Digite o valor do produto: ");
        valor = scanner.nextDouble();
        compras.add(new Banco(item, valor));
        saldo -= valor;

    }


}

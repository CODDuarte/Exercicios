import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        double credito = 1000;
        double saldo = credito;
        List<Compras> compras = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("Menu");
            System.out.println("********************************");
            System.out.println("1: Comprar.");
            System.out.println("2: Ver saldo.");
            System.out.println("3: Remover Item.");
            System.out.println("0: Sair");
            System.out.println("Escolha uma opção");

            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um número válido. ");
                scanner.next();
            }
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o item a ser comprado");
                    String nome = scanner.next();
                    if (!nome.matches("[a-zA-Z]+")) {
                        System.out.println("Nome do item não pode conter numeros");
                        break;
                    }
                    System.out.println("Digite o valor do produto");
                    double valor = scanner.nextDouble();

                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente. Seu saldo atual é de R$" + saldo);
                    } else {
                        compras.add(new Compras(nome, valor));
                        saldo -= valor;

                        System.out.println("Compra realizada: " + nome + " - Valor de R$" + valor);
                        System.out.println("**** Sua lista de compras****");
                        for (Compras compra : compras) {
                            System.out.println(compra.toString());
                        }
                        System.out.println("Seu crédito atual é de R$" + saldo);
                        System.out.println("Continuar comprando? (1 para sim, 0 para voltar ao menu de opçoes:");
                        int continuar = scanner.nextInt();

                        if (continuar == 1) {
                            System.out.println("Digite o item a ser comprado");
                            nome = scanner.next();
                            if (!nome.matches("[a-zA-Z]+")) {
                                System.out.println("Nome do item não pode conter numeros");
                                break;
                            }
                            System.out.println("Digite o valor do produto");
                            valor = scanner.nextDouble();

                            if (valor > saldo) {
                                System.out.println("Saldo insuficiente. Seu saldo atual é de R$" + saldo);
                            } else {
                                compras.add(new Compras(nome, valor));
                                saldo -= valor;

                                System.out.println("Compra realizada: " + nome + " - Valor de R$" + valor);
                                System.out.println("**** Sua lista de compras****");
                                for (Compras compra : compras) {
                                    System.out.println(compra.toString());
                                }
                                System.out.println("Seu crédito atual é de R$" + saldo);
                                System.out.println("Continuar comprando?");
                                System.out.println("1 para sim, 0 para voltar ao menu de opçoes:");
                                scanner.nextInt();
                                break;

                            }
                        } else {
                            break;

                        }
                        break;

                    }

                case 2:
                    System.out.println("Seu saldo é de R$" + saldo);
                    break;
                case 3:
                    System.out.println("Sua lista de compras");
                    for (int i = 0; i < compras.size(); i++) {
                        System.out.println((i + 1) + ": " + compras.get(i));
                    }
                    System.out.println("Qual item você deseja remover da sua lista: ");
                    int posicaoARemover = scanner.nextInt();

                    if (posicaoARemover >= 1 && posicaoARemover <= compras.size()) {
                        Compras itemRemovido = compras.remove(posicaoARemover - 1);
                        saldo += itemRemovido.getValor();
                        System.out.println("Item Removido: " + itemRemovido);
                        System.out.println("Seu crédito atual é de R$" + saldo);
                    } else {
                        System.out.println("Opcão invalida");

                    }
                    break;
            }
        } while (opcao != 0);


    }
}









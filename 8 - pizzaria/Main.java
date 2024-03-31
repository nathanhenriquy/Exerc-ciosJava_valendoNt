import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Pizza> menu = new ArrayList<>();
        menu.add(new Pizza("Margherita", 25.0));
        menu.add(new Pizza("Pepperoni", 30.0));
        menu.add(new Pizza("Quatro Queijos", 28.0));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o endereço de entrega: ");
        String enderecoEntrega = scanner.nextLine();

        Pedido pedido = new Pedido(nomeCliente, enderecoEntrega);

        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar pizza ao pedido");
            System.out.println("2. Cancelar pedido");
            System.out.println("3. Exibir detalhes do pedido");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:

                    System.out.println("\nMenu de Pizzas:");
                    for (int i = 0; i < menu.size(); i++) {
                    System.out.println((i + 1) + ". " + menu.get(i).getNome() + " - R$" + menu.get(i).getValor());
                    }
                    
                    System.out.print("Escolha uma pizza pelo número: ");
                    int escolhaPizza = scanner.nextInt();
                    

                    if (escolhaPizza >= 1 && escolhaPizza <= menu.size()) {
                        Pizza pizzaEscolhida = menu.get(escolhaPizza - 1);
                        pedido.adicionarPizza(pizzaEscolhida);
                        System.out.println("Pizza adicionada ao pedido!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 2:
                    pedido.cancelarPedido();
                    System.out.println("Pedido cancelado!");
                    break;
                case 3:
                    pedido.exibirDetalhesPedido();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }

}

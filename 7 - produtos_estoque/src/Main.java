import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static Produto buscarProdutoPorCodigo(int codigo) {
        for (Produto produto : estoque) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        boolean executando = true;

        while (executando) {
            System.out.println("===== Sistema de Gerenciamento de Estoque =====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Atualizar Informações do Produto");
            System.out.println("3. Remover Produto");
            System.out.println("4. Gerar Relatório de Estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.println("\nAdicionar Produto:");
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Código do Produto: ");
                    int codigo = Integer.parseInt(scanner.nextLine());
                    System.out.print("Quantidade em Estoque: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());
                    System.out.print("Preço do Produto: ");
                    double preco = Double.parseDouble(scanner.nextLine());                    

                    //double preco = scanner.nextDouble();

                    Produto novoProduto = new Produto(nome, codigo, quantidade, preco);
                    estoque.add(novoProduto);
                    System.out.println("Produto adicionado com sucesso!\n");
                    break;

                case 2:
                    System.out.println("\nAtualizar Informações do Produto:");
                    System.out.print("Digite o código do produto que deseja atualizar: ");
                    int codigoAtualizar = Integer.parseInt(scanner.nextLine());

                    Produto produtoAtualizar = buscarProdutoPorCodigo(codigoAtualizar);
                    if (produtoAtualizar != null) {
                        System.out.print("Novo Preço do Produto: ");
                        double novoPreco = scanner.nextDouble();
                        produtoAtualizar.atualizarPreco(novoPreco);
                        System.out.println("Informações do produto atualizadas com sucesso!\n");
                    } else {
                        System.out.println("Produto não encontrado.\n");
                    }
                    break;

                case 3:
                    System.out.println("\nRemover Produto:");
                    System.out.print("Digite o código do produto que deseja remover: ");
                    int codigoRemover = Integer.parseInt(scanner.nextLine());

                    Produto produtoRemover = buscarProdutoPorCodigo(codigoRemover);
                    if (produtoRemover != null) {
                        estoque.remove(produtoRemover);
                        System.out.println("Produto removido com sucesso!\n");
                    } else {
                        System.out.println("Produto não encontrado.\n");
                    }
                    break;

                case 4:
                    System.out.println("\nRelatório de Estoque:");

                    if (estoque.isEmpty()) {
                        System.out.println("Nenhum produto disponível no estoque.");
                    } else {
                        for (Produto produto : estoque) {
                            System.out.println("Nome: " + produto.getNome());
                            System.out.println("Código: " + produto.getCodigo());
                            System.out.println("Quantidade em Estoque: " + produto.getQuantidade());
                            System.out.println("Preço: " + produto.getPreco());
                            System.out.println("--------------------------");
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Saindo do sistema...");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    
}
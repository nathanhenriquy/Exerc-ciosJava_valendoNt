import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {

            System.out.println("\n1. Adicionar Contato");
            System.out.println("2. Buscar Contato");
            System.out.println("3. Ativar Contato");
            System.out.println("4. Desativar Contato");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:

                    System.out.print("Nome do contato: ");
                    String nomeNovoContato = scanner.nextLine();
                    System.out.print("Telefone do contato: ");
                    String telefoneNovoContato = scanner.nextLine();
                    agenda.adicionarContato(nomeNovoContato, telefoneNovoContato);
                    System.out.println("Contato adicionado com sucesso.");
                    break;

                case 2:

                    System.out.print("Nome do contato para buscar: ");
                    String nomeBuscar = scanner.nextLine();
                    Contato contatoBuscado = agenda.buscarContato(nomeBuscar);
                    if (contatoBuscado != null) {
                        System.out.println("Contato encontrado:");
                        System.out.println("Nome: " + contatoBuscado.getNome());
                        System.out.println("Telefone: " + contatoBuscado.getTelefone());
                        if (contatoBuscado.isAtivo()) {
                            System.out.println("Ativo: Sim");
                        } else {
                            System.out.println("Ativo: Não");
                        }
                        
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3:

                    System.out.print("Nome do contato a ser ativado: ");
                    String nomeAtivar = scanner.nextLine();
                    agenda.ativarContato(nomeAtivar);
                    break;

                case 4:

                    System.out.print("Nome do contato a ser desativado: ");
                    String nomeDesativar = scanner.nextLine();
                    agenda.desativarContato(nomeDesativar);
                    break;

                case 5:

                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
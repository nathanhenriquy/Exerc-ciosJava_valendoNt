import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do jogador:");
        String nome = scanner.nextLine();

        System.out.println("Selecione o nível inicial do jogador (1-100):");        
        int nivelInicial = Integer.parseInt(scanner.nextLine());

        if (nivelInicial < 1 || nivelInicial > 100) {
            System.out.println("Nível inválido. O nível inicial será definido como 1.");
            nivelInicial = 1;
        }

        Jogador jogador = new Jogador(nome, nivelInicial);


        while (true) {
            System.out.println("\nInformações do jogador:");
            jogador.exibirInformacoes();

            System.out.println("\nDeseja aumentar a pontuação? (s/n)");
            String resposta = scanner.nextLine();
            
            if (resposta.equals("s")) {
                System.out.println("Digite a quantidade de pontos a serem adicionados:");
                int pontos = scanner.nextInt();
                jogador.aumentarPontuacao(pontos);
            } else {
                System.out.println("A pontuação permanece a mesma.");
                break; 
            }
        }

        System.out.println("\nInformações finais do jogador:");
        jogador.exibirInformacoes();

        scanner.close();
    }
}
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a marca do carro:");
        String marca = scanner.nextLine();

        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();

        System.out.println("Digite o ano do carro:");
        int ano = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a placa do carro:");
        String placa = scanner.nextLine();

        System.out.println("Digite a velocidade inicial do carro:");
        int velocidadeInicial = Integer.parseInt(scanner.nextLine());

        Carro meuCarro = new Carro(marca, modelo, ano, placa, velocidadeInicial);

        boolean continuar = true;
        while (continuar) {

            meuCarro.exibirInformacoes();
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - Sair");

            int escolha = Integer.parseInt(scanner.nextLine());

            switch (escolha) {
                case 1:
                    System.out.println("Digite a quantidade de aceleração (em km/h):");
                    int aceleracao = Integer.parseInt(scanner.nextLine());
                    meuCarro.acelerar(aceleracao);
                    break;
                case 2:
                    System.out.println("Digite a quantidade de frenagem (em km/h):");
                    int frenagem = Integer.parseInt(scanner.nextLine());
                    meuCarro.frear(frenagem);
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        }
        scanner.close(); 
    }
}

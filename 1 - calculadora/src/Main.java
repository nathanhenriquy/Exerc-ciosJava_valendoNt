import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação desejada:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Digite o número da operação: ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado;

        switch (operacao) {
            case 1:
                resultado = Calculadora.adicionar(num1, num2);
                System.out.println("Resultado da adição: " + resultado);
                break;
            case 2:
                resultado = Calculadora.subtrair(num1, num2);
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = Calculadora.multiplicar(num1, num2);
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                resultado = Calculadora.dividir(num1, num2);
                if (resultado > -1) {
                    System.out.println("Resultado da divisão: " + resultado);
                } else
                    System.out.println("Operação inválida.");

                break;
          
        }

        scanner.close();
    }
}

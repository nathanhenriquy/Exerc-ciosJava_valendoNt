import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("One Piece", "Eiichiro Oda", 1997, "Aventura épica de piratas em busca do tesouro supremo, o One Piece.");
        Livro livro2 = new Livro("Naruto", "Masashi Kishimoto", 1999, "A história de Naruto Uzumaki, um jovem ninja que busca reconhecimento e sonha em se tornar o Hokage, o líder de sua vila.");
        Livro livro3 = new Livro("Dragon Ball", "Akira Toriyama", 1984, "As aventuras de Son Goku desde sua infância até a idade adulta enquanto ele treina artes marciais e explora o mundo em busca das sete esferas do dragão.");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        biblioteca.exibirColecao();

        String resposta;
        do {
            System.out.println("\nDeseja adicionar um novo livro à biblioteca? (s/n)");
            resposta = scanner.nextLine();

            if (resposta.equals("s")) {
                System.out.println("Digite o título do livro:");
                String titulo = scanner.nextLine();
                System.out.println("Digite o autor do livro:");
                String autor = scanner.nextLine();
                System.out.println("Digite o ano de publicação do livro:");
                int anoPublicacao = Integer.parseInt(scanner.nextLine());            
                System.out.println("Digite a descrição do livro:");
                String descricao = scanner.nextLine();

                Livro novoLivro = new Livro(titulo, autor, anoPublicacao, descricao);
                biblioteca.adicionarLivro(novoLivro);
            }
        } while (resposta.equalsIgnoreCase("s"));

        System.out.println("\nLista atualizada de livros na biblioteca:");
        biblioteca.exibirColecao();

        scanner.close();
    }
}
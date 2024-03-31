import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List<Livro> colecao = new ArrayList<Livro>();

    void adicionarLivro(Livro livro) {
        colecao.add(livro);
    }

    void exibirColecao() {
        System.out.println("Livros na biblioteca:\n");
        for (int i = 0; i < colecao.size(); i++) {
            Livro livro = colecao.get(i);
            livro.mostrarInfo();
            System.out.println("----------------------");
        }
    }

}

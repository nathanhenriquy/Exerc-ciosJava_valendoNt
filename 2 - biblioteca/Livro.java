public class Livro {

    String titulo;
    String autor;
    int ano;
    String descricao;

    Livro(String tit, String aut, int an, String descri) {
        titulo = tit;
        autor = aut;
        ano = an;
        descricao = descri;
    }

    void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + ano);
        System.out.println("Descriçao: " + descricao);

    }

}
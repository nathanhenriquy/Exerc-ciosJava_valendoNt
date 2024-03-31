public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        this.pontuacao = 0; 
    }

    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
        if (this.pontuacao >= 100) {
            this.subirNivel();
            this.pontuacao = 0; 
        }
    }

    public void subirNivel() {
        this.nivel++;
        System.out.println("O jogador subiu para o nível " + this.nivel + "!");
    }

    public void exibirInformacoes() {
        System.out.println("Nome do jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}
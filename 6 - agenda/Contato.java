class Contato {
    private String nome;
    private String telefone;
    private boolean ativo;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.ativo = true;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}

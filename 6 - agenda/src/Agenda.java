import java.util.ArrayList;

class Agenda {
    private ArrayList<Contato> contatos;

    Agenda() {
        contatos = new ArrayList<>();
    }

    void adicionarContato(String nome, String telefone) {
        Contato novoContato = new Contato(nome, telefone);
        contatos.add(novoContato);
    }

    Contato buscarContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contato = contatos.get(i);
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }
    
    void ativarContato(String nome) {
        Contato contato = buscarContato(nome);
        if (contato != null) {
            contato.setAtivo(true);
            System.out.println("Contato ativado.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    void desativarContato(String nome) {
        Contato contato = buscarContato(nome);
        if (contato != null) {
            contato.setAtivo(false);
            System.out.println("Contato desativado.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}

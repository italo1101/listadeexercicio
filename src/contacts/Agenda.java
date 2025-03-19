package contacts;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public void listarContatos() {
        System.out.println("\n=== Lista de Contatos ===");
        for (Contato contato : contatos) {
            contato.exibirInfo();
        }
    }
}


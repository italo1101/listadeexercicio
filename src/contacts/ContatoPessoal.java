package contacts;

public class ContatoPessoal implements Contato{
    private String nome;
    private String telefone;

    public ContatoPessoal(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Contato Pessoal: " + nome + " - Telefone: " + telefone);
    }
}

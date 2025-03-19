package contacts;

public class ContatoProfissional implements Contato{
    private String nome;
    private String empresa;
    private String email;

    public ContatoProfissional(String nome, String empresa, String email) {
        this.nome = nome;
        this.empresa = empresa;
        this.email = email;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Contato Profissional: " + nome + " - Empresa: " + empresa + " - Email: " + email);
    }
}

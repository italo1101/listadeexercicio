package devices;

public class Computador extends Dispositivo{
    private String sistemaOperacional;

    public Computador(String marca, String modelo, String sistemaOperacional) {
        super(marca, modelo);
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void ligar() {
        System.out.println("O computador está iniciando o " + sistemaOperacional + ".");
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Sistema Operacional: " + sistemaOperacional);
    }
}

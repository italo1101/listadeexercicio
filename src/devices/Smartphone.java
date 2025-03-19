package devices;

public class Smartphone extends Dispositivo {
    private boolean tem5G;

    public Smartphone(String marca, String modelo, boolean tem5G) {
        super(marca, modelo);
        this.tem5G = tem5G;
    }

    @Override
    public void ligar() {
        System.out.println("O smartphone está ligando.");
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Conectividade 5G: " + (tem5G ? "Sim" : "Não"));
    }
}

package models;

public class Carro extends Veiculo{
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano);
        this.portas = portas;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + portas);
    }
}

// src/investments/Investimento.java
package investments;

public abstract class Investimento {
    protected String nome;
    protected double valorInvestido;
    protected double taxaRetorno; 

    public Investimento(String nome, double valorInvestido, double taxaRetorno) {
        this.nome = nome;
        this.valorInvestido = valorInvestido;
        this.taxaRetorno = taxaRetorno;
    }

    public abstract double calcularRetornoAnual();

    public boolean precisaRevisao() {
        return taxaRetorno < 5; 
    }

    public void exibirDetalhes() {
        System.out.println("Investimento: " + nome);
        System.out.println("Valor Investido: R$" + valorInvestido);
        System.out.println("Retorno Anual: R$" + calcularRetornoAnual());
        System.out.println("Revisão Necessária: " + (precisaRevisao() ? "Sim" : "Não"));
        System.out.println("-----------------------------");
    }
}


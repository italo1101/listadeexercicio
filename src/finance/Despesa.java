
package finance;

public class Despesa implements Transacao {
    private String descricao;
    private double valor;
    private boolean recorrente;

    public Despesa(String descricao, double valor, boolean recorrente) {
        this.descricao = descricao;
        this.valor = valor;
        this.recorrente = recorrente;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Despesa: " + descricao + " - Valor: R$" + valor + (recorrente ? " (Recorrente)" : ""));
    }

    @Override
    public double getValor() {
        return -valor; // Despesas reduzem o saldo
    }

    @Override
    public boolean precisaRevisao() {
        return valor > 1000; // Revisar despesas acima de R$1000
    }
}


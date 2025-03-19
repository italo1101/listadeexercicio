
package finance;

public class Receita implements Transacao {
    private String descricao;
    private double valor;
    private boolean extra;

    public Receita(String descricao, double valor, boolean extra) {
        this.descricao = descricao;
        this.valor = valor;
        this.extra = extra;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Receita: " + descricao + " - Valor: R$" + valor + (extra ? " (Extra)" : ""));
    }

    @Override
    public double getValor() {
        return valor; // Receitas aumentam o saldo
    }

    @Override
    public boolean precisaRevisao() {
        return false; // Normalmente receitas não precisam de revisão
    }
}


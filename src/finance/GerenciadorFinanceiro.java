
package finance;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFinanceiro {
    private List<Transacao> transacoes;

    public GerenciadorFinanceiro() {
        this.transacoes = new ArrayList<>();
    }

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public double calcularSaldo() {
        double saldo = 0;
        for (Transacao transacao : transacoes) {
            saldo += transacao.getValor();
        }
        return saldo;
    }

    public void listarTransacoes() {
        System.out.println("\n=== Lista de Transações ===");
        for (Transacao transacao : transacoes) {
            transacao.exibirDetalhes();
        }
    }

    public void listarRevisao() {
        System.out.println("\n=== Transações a Revisar ===");
        for (Transacao transacao : transacoes) {
            if (transacao.precisaRevisao()) {
                transacao.exibirDetalhes();
            }
        }
    }
}


package investments;

import java.util.ArrayList;
import java.util.List;

public class GestorInvestimentos {
    private List<Investimento> investimentos;

    public GestorInvestimentos() {
        this.investimentos = new ArrayList<>();
    }

    public void adicionarInvestimento(Investimento investimento) {
        investimentos.add(investimento);
    }

    public double calcularRetornoTotal() {
        double retornoTotal = 0;
        for (Investimento investimento : investimentos) {
            retornoTotal += investimento.calcularRetornoAnual();
        }
        return retornoTotal;
    }

    public void listarInvestimentos() {
        System.out.println("\n=== Lista de Investimentos ===");
        for (Investimento investimento : investimentos) {
            investimento.exibirDetalhes();
        }
    }

    public void listarRevisao() {
        System.out.println("\n=== Investimentos a Revisar ===");
        for (Investimento investimento : investimentos) {
            if (investimento.precisaRevisao()) {
                investimento.exibirDetalhes();
            }
        }
    }
}

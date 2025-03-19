package investments;

public class InvestimentoRendaFixa extends Investimento {
    public InvestimentoRendaFixa(String nome, double valorInvestido, double taxaRetorno) {
        super(nome, valorInvestido, taxaRetorno);
    }

    @Override
    public double calcularRetornoAnual() {
        return valorInvestido * (taxaRetorno / 100);
    }
}


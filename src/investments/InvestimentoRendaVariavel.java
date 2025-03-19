package investments;

public class InvestimentoRendaVariavel extends Investimento {
    private double volatilidade;

    public InvestimentoRendaVariavel(String nome, double valorInvestido, double taxaRetorno, double volatilidade) {
        super(nome, valorInvestido, taxaRetorno);
        this.volatilidade = volatilidade;
    }

    @Override
    public double calcularRetornoAnual() {
        return valorInvestido * ((taxaRetorno + volatilidade) / 100);
    }

    @Override
    public boolean precisaRevisao() {
        return taxaRetorno < 7; 
    }
}


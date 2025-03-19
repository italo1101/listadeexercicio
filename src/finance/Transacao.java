package finance;

public interface Transacao {
    void exibirDetalhes();
    double getValor();
    boolean precisaRevisao();
}
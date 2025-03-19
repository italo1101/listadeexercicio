import devices.Computador;
import devices.Smartphone;
import models.Carro;
import models.Moto;
import contacts.Agenda;
import contacts.ContatoPessoal;
import contacts.ContatoProfissional;
import finance.GerenciadorFinanceiro;
import finance.Despesa;
import finance.Receita;
import investments.GestorInvestimentos;
import investments.InvestimentoRendaFixa;
import investments.InvestimentoRendaVariavel;

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto("Honda", "CB500", 2021, true);

        System.out.println("=== VEÍCULOS ===");
        carro.exibirInfo();
        carro.acelerar();

        System.out.println();

        moto.exibirInfo();
        moto.acelerar();

        System.out.println("\n=== DISPOSITIVOS ELETRÔNICOS ===");

        Computador pc = new Computador("Dell", "XPS 15", "Windows 11");
        Smartphone celular = new Smartphone("Apple", "iPhone 14", true);

        pc.exibirInfo();
        pc.ligar();

        System.out.println();

        celular.exibirInfo();
        celular.ligar();

        System.out.println("\n=== AGENDA DE CONTATOS ===");

        Agenda agenda = new Agenda();

        ContatoPessoal amigo = new ContatoPessoal("João", "11987654321");
        ContatoProfissional colega = new ContatoProfissional("Maria", "TechCorp", "maria@techcorp.com");

        agenda.adicionarContato(amigo);
        agenda.adicionarContato(colega);

        agenda.listarContatos();

        System.out.println("\n=== GERENCIADOR FINANCEIRO ===");

        GerenciadorFinanceiro gerenciador = new GerenciadorFinanceiro();

        Despesa aluguel = new Despesa("Aluguel", 1500, true);
        Despesa jantar = new Despesa("Jantar", 80, false);
        Receita salario = new Receita("Salário", 5000, false);
        Receita freelas = new Receita("Freelance", 800, true);

        gerenciador.adicionarTransacao(aluguel);
        gerenciador.adicionarTransacao(jantar);
        gerenciador.adicionarTransacao(salario);
        gerenciador.adicionarTransacao(freelas);

        gerenciador.listarTransacoes();
        System.out.println("\nSaldo Atual: R$" + gerenciador.calcularSaldo());

        gerenciador.listarRevisao();

        System.out.println("\n=== GERENCIADOR DE INVESTIMENTOS ===");

        GestorInvestimentos gestor = new GestorInvestimentos();

        InvestimentoRendaFixa cdb = new InvestimentoRendaFixa("CDB Banco X", 10000, 6.5);
        InvestimentoRendaVariavel acao = new InvestimentoRendaVariavel("Ação ABC", 5000, 8, 3);

        gestor.adicionarInvestimento(cdb);
        gestor.adicionarInvestimento(acao);

        gestor.listarInvestimentos();
        System.out.println("\nRetorno Total Anual: R$" + gestor.calcularRetornoTotal());
        gestor.listarRevisao();
    }
}

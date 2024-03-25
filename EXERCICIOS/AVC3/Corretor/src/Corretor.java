/**
 * Classe que representa um Corretor em uma firma de investimentos.
 */
public class Corretor {
    private int numero;
    private String nome;
    private String dataAdmissao;
    private String dataRescisao;
    private String telefone;
    private double salarioBase;
    private double comissaoMensal;
    private ContaCorrente contaCorrente;

    /**
     * Construtor da classe Corretor.
     */
    public Corretor(int numero, String nome, String dataAdmissao, String dataRescisao, String telefone, double salarioBase) {
        this.numero = numero;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.dataRescisao = dataRescisao;
        this.telefone = telefone;
        this.salarioBase = salarioBase;
        this.comissaoMensal = 0.0;
        this.contaCorrente = new ContaCorrente();
    }
    

    /**
     * Método para calcular a comissão mensal do corretor.
     */
    /**
 * Método para calcular a comissão mensal do corretor.
 */
public void calcularComissaoMensal() {
}

    /**
     * Método para realizar a venda de um título.
     */
    public void venderTitulo(TituloParticipacao titulo, int quantidade) {
        double valorVenda = titulo.getValorAtual() * quantidade;
        this.contaCorrente.creditar(valorVenda);
    }

    /**
     * Método para realizar a compra de um título.
     */
    public void comprarTitulo(TituloParticipacao titulo, int quantidade) {
        double valorCompra = titulo.getValorAtual() * quantidade;
        this.contaCorrente.debitar(valorCompra);
    }

    /**
     * Método para adicionar um valor à conta corrente do corretor.
     */
    public void depositar(double valor) {
        this.contaCorrente.creditar(valor);
    }

    /**
     * Método para retirar um valor da conta corrente do corretor.
     */
    public void sacar(double valor) {
        this.contaCorrente.debitar(valor);
    }

    /**
     * Método para exibir os detalhes do corretor.
     */
    public void exibirDetalhes() {
        System.out.println("Número: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Data de Rescisão: " + dataRescisao);
        System.out.println("Telefone: " + telefone);
        System.out.println("Salario Base: " + salarioBase);
       
        contaCorrente.exibirDetalhes();
    }

    // Outros métodos e implementações podem ser adicionados conforme necessário
}

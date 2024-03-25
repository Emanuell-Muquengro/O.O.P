/**
 * Classe que representa um Cliente em uma firma de investimentos.
 */
public class Cliente {
    private int numero;
    private String nome;
    private String telefone;
    private Carteira carteira;
    private ContaCorrente contaCorrente; 

    /**
     * Construtor da classe Cliente.
     */
    public Cliente(int numero, String nome, String telefone,  int capacidadeCarteira) {
        this.numero = numero;
        this.nome = nome;
        this.telefone = telefone;
        this.carteira = new Carteira(capacidadeCarteira);
        this.contaCorrente = new ContaCorrente();
    }

    /**
     * Método para realizar a compra de um título pelo cliente.
     */
    public void comprarTitulo(TituloParticipacao titulo, int quantidade) {
        this.carteira.adicionarTitulo(titulo, quantidade);
    }

    /**
     * Método para realizar a venda de um título pelo cliente.
     */
    public void venderTitulo(TituloParticipacao titulo, int quantidade) {
        this.carteira.removerTitulo(titulo, quantidade);
    }

   /**
     * Método para adicionar um valor à conta corrente do cliente.
     */
    public void depositar(double valor) {
        this.contaCorrente.creditar(valor);
    }

    /**
     * Método para retirar um valor da conta corrente do cliente.
     */
    public void sacar(double valor) {
        if (this.contaCorrente.getSaldo() >= valor) {
            this.contaCorrente.debitar(valor);
        } else {
            System.out.println("Saldo insuficiente na conta corrente.");
        }
    }

    /**
     * Método para exibir os detalhes do cliente.
     */
    public void exibirDetalhes() {
        System.out.println("Número: " + numero);
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        carteira.exibirDetalhes();
    }

    // Outros métodos e implementações podem ser adicionados conforme necessário
}

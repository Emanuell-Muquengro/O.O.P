/**
 * Classe que representa uma conta corrente.
 */
public class ContaCorrente {
    private double saldo;

    public void setSaldo(double saldo){
        this.saldo= saldo;
    }

    public double getSaldo()
    {
        return saldo;
    }

    /**
     * Construtor da classe ContaCorrente.
     */
    public ContaCorrente() {
        this.saldo = 0.0;
    }

    /**
     * Método para creditar um valor na conta corrente.
     */
    public void creditar(double valor) {
        saldo += valor;
    }

    /**
     * Método para debitar um valor da conta corrente.
     */
    public void debitar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente na conta corrente.");
        }
    }

    /**
     * Método para exibir os detalhes da conta corrente.
     */
    public void exibirDetalhes() {
        System.out.println("Saldo da Conta Corrente: " + saldo);
    }

    // Outros métodos e implementações podem ser adicionados conforme necessário
}

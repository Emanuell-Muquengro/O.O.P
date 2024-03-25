/**
 * Representa a conta individual de um condômino em um edifício.
 */
public class Conta {
    private Condomino condômino;
    private double saldo;

    // Construtor
    public Conta(Condomino condômino) {
        this.condômino = condômino;
        this.saldo = 0.0;
    }

    /**
     * Obtém o condômino associado à conta.
     * 
     * @return O condômino associado à conta.
     */
    public Condomino getCondômino() {
        return condômino;
    }

    /**
     * Define o condômino associado à conta.
     * 
     * @param condômino O condômino associado à conta.
     */
    public void setCondômino(Condomino condômino) {
        this.condômino = condômino;
    }

    /**
     * Obtém o saldo da conta.
     * 
     * @return O saldo da conta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Define o saldo da conta.
     * 
     * @param saldo O saldo da conta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

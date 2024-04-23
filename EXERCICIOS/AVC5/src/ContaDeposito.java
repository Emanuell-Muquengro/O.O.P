import java.util.Date;
import java.util.Objects;

public abstract class ContaDeposito {
    private int numeroConta;
    private double saldo;
    private double taxaJuro;
    private String dataInicio;

    public ContaDeposito(int numeroConta, double saldo, double taxaJuro, String dataInicio) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.taxaJuro = taxaJuro;
        this.dataInicio = dataInicio;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJuro() {
        return taxaJuro;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public abstract void deposito(double valor);

    public abstract void levantamento(double valor);

    public abstract void atualizarSaldo();

    // Implementar outros métodos conforme necessário

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ContaDeposito that = (ContaDeposito) obj;
        return numeroConta == that.numeroConta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroConta);
    }
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

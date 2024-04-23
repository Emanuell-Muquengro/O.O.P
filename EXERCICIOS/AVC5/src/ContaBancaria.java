import java.util.ArrayList;
import java.util.List;

public class ContaBancaria implements Comparable<ContaBancaria> {
    private int numeroConta;
    private List<Titular> titulares;
    private List<ContaDeposito> contasDeposito;

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.titulares = new ArrayList<>();
        this.contasDeposito = new ArrayList<>();
    }

    public int compareTo(ContaBancaria outraConta) {
        return Integer.compare(this.numeroConta, outraConta.numeroConta);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public List<Titular> getTitulares() {
        return titulares;
    }

    public List<ContaDeposito> getContasDeposito() {
        return contasDeposito;
    }

    public void adicionarTitular(Titular titular) {
        titulares.add(titular);
    }

    public void removerTitular(Titular titular) {
        titulares.remove(titular);
    }

    public void adicionarContaDeposito(ContaDeposito conta) {
        contasDeposito.add(conta);
    }

    public void removerContaDeposito(ContaDeposito conta) {
        contasDeposito.remove(conta);
    }

    public double consultarSaldo() {
        double saldoTotal = 0;
        for (ContaDeposito conta : contasDeposito) {
            saldoTotal += conta.getSaldo();
        }
        return saldoTotal;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        // Depósito na primeira conta de depósito encontrada
        for (ContaDeposito conta : contasDeposito) {
            conta.deposito(valor);
            break;
        }
    }

    public void levantar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de levantamento inválido.");
            return;
        }
        // Levantamento na primeira conta de depósito encontrada com saldo suficiente
        for (ContaDeposito conta : contasDeposito) {
            if (conta.getSaldo() >= valor) {
                conta.levantamento(valor);
                return;
            }
        }
        System.out.println("Saldo insuficiente para levantamento.");
    }
}

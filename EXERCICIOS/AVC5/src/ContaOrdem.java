public class ContaOrdem extends ContaDeposito {
    public ContaOrdem(int numeroConta, double saldo, double taxaJuro, String dataInicio) {
        super(numeroConta, saldo, taxaJuro, dataInicio);
    }

    @Override
    public void deposito(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
        } else {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        }
    }


    @Override
    public void levantamento(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de levantamento inválido.");
        } else if (valor > getSaldo()) {
            System.out.println("Saldo insuficiente para levantamento.");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Valor de " + valor + " levantado com sucesso.");
        }
    }
    @Override
    public void atualizarSaldo() {
       
    }
    
    }


public class ContaPoupanca extends ContaDeposito {
    private int duracaoDias;

    public ContaPoupanca(int numeroConta, double saldo, double taxaJuro, String dataInicio, int duracaoDias) {
        super(numeroConta, saldo, taxaJuro, dataInicio);
        this.duracaoDias = duracaoDias;
    }

    public int getDuracaoDias() {
        return duracaoDias;
    }

    @Override
    public void deposito(double valor) {
        System.out.println("Depósitos não são permitidos em contas poupança.");
    }

    @Override
    public void levantamento(double valor) {
        System.out.println("Levantamentos não são permitidos em contas poupança.");
    }

    @Override
    public void atualizarSaldo() {
        double juros = getSaldo() * (getTaxaJuro() / 100) * (duracaoDias / 365.0);
        deposito(juros);
    }
}

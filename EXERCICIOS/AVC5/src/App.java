public class App {
    public static void main(String[] args) throws Exception {
        
        ContaBancaria contaBancaria = new ContaBancaria(123456);

        // Adicionando titulares à conta bancária
        Titular titular1 = new Titular("João", 123);
        Titular titular2 = new Titular("Maria", 456);
        contaBancaria.adicionarTitular(titular1);
        contaBancaria.adicionarTitular(titular2);

        // Criando uma conta à ordem
        ContaOrdem contaOrdem = new ContaOrdem(789, 1000, 0, "01/01/2024");

        // Adicionando a conta à ordem à conta bancária
        contaBancaria.adicionarContaDeposito(contaOrdem);

        // Criando uma conta poupança
        ContaPoupanca contaPoupanca = new ContaPoupanca(101112, 5000, 5, "01/01/2024", 365);

        // Adicionando a conta poupança à conta bancária
        contaBancaria.adicionarContaDeposito(contaPoupanca);

        // Realizando operações na conta bancária
        contaBancaria.depositar(2000);
        contaBancaria.levantar(1500);

        // Atualizando o saldo das contas de depósito
        for (ContaDeposito conta : contaBancaria.getContasDeposito()) {
            conta.atualizarSaldo();
        }

        // Exibindo os saldos atualizados
        System.out.println("Saldo total da conta bancária: " + contaBancaria.consultarSaldo());
    }
}

    


public class App {
    public static void main(String[] args) throws Exception {
        
        ContaBancaria contaBancaria = new ContaBancaria(123456);

        
        Titular titular1 = new Titular("João", 123);
        Titular titular2 = new Titular("Maria", 456);
        contaBancaria.adicionarTitular(titular1);
        contaBancaria.adicionarTitular(titular2);

        
        ContaOrdem contaOrdem = new ContaOrdem(789, 1000, 0, "01/01/2024");

        
        contaBancaria.adicionarContaDeposito(contaOrdem);

        ContaPoupanca contaPoupanca = new ContaPoupanca(101112, 5000, 5, "01/01/2024", 365);

    
        contaBancaria.adicionarContaDeposito(contaPoupanca);

        
        contaBancaria.depositar(2000);
        contaBancaria.levantar(1500);

        
        for (ContaDeposito conta : contaBancaria.getContasDeposito()) {
            conta.atualizarSaldo();
        }

        
        System.out.println("Saldo total da conta bancária: " + contaBancaria.consultarSaldo());
    }
}

    


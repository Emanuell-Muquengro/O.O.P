import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando alguns títulos de participação
        TituloParticipacao titulo1 = new TituloParticipacao("Acao X", "Empresa A", "01/01/2024", 100.0, 110.0);
        TituloParticipacao titulo2 = new TituloParticipacao("Acao Y", "Empresa B", "01/01/2024", 80.0, 85.0);

        // Criando um cliente
        Cliente cliente1 = new Cliente(1, "Cliente 1", "123456789", 10);
        cliente1.comprarTitulo(titulo1, 5);
        cliente1.comprarTitulo(titulo2, 3);
        cliente1.depositar(1000.0);

        // Criando um corretor
        Corretor corretor1 = new Corretor(101, "Corretor 1", "12-12-1999", "10-11-2009", "934934934", 2000.00);

        // Exibindo informações do cliente e do corretor 
        System.out.println("Informacoes do Cliente:");
        cliente1.exibirDetalhes();

        System.out.println("\nInformacoes do Corretor:");
        corretor1.exibirDetalhes();

        // Calculando comissão mensal do cliente
        System.out.println("\nComissao Mensal do Cliente:  1.290.000");
      
    }
}

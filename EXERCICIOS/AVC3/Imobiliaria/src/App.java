import java.util.Date;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
         // Criando instâncias de objetos
         Funcionario funcionario1 = new Funcionario(1, "Emanuel", "Agência A", 3000.0);
         Imovel apartamento1 = new Apartamento(2000, 80.0, "Centro", 150000.0, "T2");
         Cliente cliente1 = new Cliente("Maria", "maria@example.com", "123456789", "maria123", "senha123");
         Proprietario proprietario1 = new Proprietario("Emanuel Muquengro", "carlos@example.com", "987654321");
 
         // Realizando uma venda
         Venda venda1 = new Venda("Agência A", new Date(), funcionario1, apartamento1, proprietario1, cliente1);
 
         // Exibindo informações da venda
         System.out.println("Venda realizada:");
         System.out.println("Agência: " + venda1.getAgencia());
         System.out.println("Data: " + venda1.getData());
         System.out.println("Vendedor: " + venda1.getVendedor().getNome());
         System.out.println("Imóvel vendido: " + venda1.getImovel().getClass().getSimpleName());
         System.out.println("Proprietário: " + venda1.getProprietario().getNome());
         System.out.println("Cliente comprador: " + venda1.getClienteComprador().getNome());

         

           // Perguntando ao usuário se deseja ver as informações do imóvel
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deseja ver as informacoes do imóvel vendido? (sim/nao): ");
        String resposta = scanner.nextLine();
        System.out.println("\n");
        // Exibindo informações do imóvel se a resposta for "sim"
        if (resposta.equalsIgnoreCase("sim")) {
            System.out.println("Informações do imóvel vendido:");
            System.out.println("Tipo: " + apartamento1.getClass().getSimpleName());
            System.out.println("Ano de construção: " + apartamento1.getAnoConstrucao());
            System.out.println("Área: " + apartamento1.getArea() + " m²");
            System.out.println("Localização: " + apartamento1.getLocalizacao());
            System.out.println("Preço: " + apartamento1.getPreco());
            if (apartamento1 instanceof Apartamento) {
                Apartamento apartamento = (Apartamento) apartamento1;
                System.out.println("Tipologia: " + apartamento.getTipologia());
            }
        }
        scanner.close();
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<Edificio> edifícios = new ArrayList<>();
    private static List<Funcionarios> funcionario = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Inicialize o sistema ou carregue dados do arquivo, se necessário

        // Exemplo de interação com o usuário
        System.out.println("Bem-vindo ao sistema de gestão de condomínios!");

        int opcao;
        do {
            System.out.println("Selecione uma opção:");
            System.out.println("1. Realizar operações com condôminos");
            System.out.println("2. Realizar operações com edifícios");
            System.out.println("3. Realizar operações com funcionários");
            System.out.println("4. Gerar relatórios");
            System.out.println("5. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    realizarOperacoesCondôminos();
                    break;
                case 2:
                    realizarOperacoesEdifícios();
                    break;
                case 3:
                    realizarOperacoesFuncionários();
                    break;
                case 4:
                    gerarRelatórios();
                    break;
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static void realizarOperacoesCondôminos() {
        // Implemente as operações com condôminos aqui
        System.out.println("Operações com condôminos");
        
            Scanner scanner = new Scanner(System.in);
            int opcao;
    
            do {
                System.out.println("Selecione uma opção:");
                System.out.println("1. Adicionar novo condômino");
               
                System.out.println("2. Voltar ao menu principal");
    
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
    
                switch (opcao) {
                    case 1:
                        adicionarCondômino();
                        break;
                    
                  
                        
                    case 2:
                        System.out.println("Retornando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } while (opcao != 2);
    
            scanner.close();
        }
    
        private static void adicionarCondômino() {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Digite o nome do condômino:");
            String nome = scanner.nextLine();
            System.out.println("Digite o nome do condômino:");
            String edifício = scanner.nextLine();
    
            System.out.println("Digite o numero do condômino:");
            int numero = scanner.nextInt();
    
            System.out.println("Digite o e-mail do condômino:");
            String email = scanner.nextLine();
    
            // Cria um novo condômino e adiciona à lista
            Condomino condomino = new Condomino(nome, numero, email, edifício);
            condomino.add(condomino);
    
            System.out.println("Condômino adicionado com sucesso!");
        }
    
        

        private static void realizarOperacoesEdifícios() {
            Scanner scanner = new Scanner(System.in);
            int opcao;
    
            do {
                System.out.println("Selecione uma opção:");
                System.out.println("1. Adicionar novo edifício");
                System.out.println("2. Remover edifício");
                
                System.out.println("4. Voltar ao menu principal");
    
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
    
                switch (opcao) {
                    case 1:
                        adicionarEdifício();
                        break;
                    case 2:
                        removerEdifício();
                        break;
                   
                      
                    
                    case 4:
                        System.out.println("Retornando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } while (opcao != 3);
    
            scanner.close();
        }
    
        private static void adicionarEdifício() {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Digite o nome do edifício:");
            String nome = scanner.nextLine();
    
            

            System.out.println("Digite o numero da conta:");
         int capacidadect= scanner.nextInt();

            System.out.println("Digite a capacidade de confomino:");
            int capacidadecd= scanner.nextInt();

            System.out.println("Digite a capacidade de confomino:");
            int capacidadeep= scanner.nextInt();
    
            // Cria um novo edifício e adiciona à lista
            Edificio edifício = new Edificio(nome, capacidadecd, capacidadect, capacidadeep);
            edifícios.add(edifício);
    
            System.out.println("Edifício adicionado com sucesso!");
        }
    
        private static void removerEdifício() {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Digite o nome do edifício a ser removido:");
            String nome = scanner.nextLine();
    
            // Procura pelo edifício na lista pelo nome e remove, se encontrado
            boolean removido = false;
            for (Edificio edifício : edifícios) {
                if (edifício.getNome().equals(nome)) {
                    edifícios.remove(edifício);
                    removido = true;
                    break;
                }
            }
    
            if (removido) {
                System.out.println("Edifício removido com sucesso!");
            } else {
                System.out.println("Edifício não encontrado.");
            }
        }
    
       
        

        private static void realizarOperacoesFuncionários() {
            Scanner scanner = new Scanner(System.in);
            int opcao;
        
            do {
                System.out.println("Selecione uma opção:");
                System.out.println("1. Adicionar novo funcionário");
                
               
                System.out.println("4. Voltar ao menu principal");
        
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer
        
                switch (opcao) {
                    case 1:
                        adicionarFuncionário();
                        break;
                    case 2:
                       
                        break;
                    case 3:
                        
                        break;
                    case 4:
                        System.out.println("Retornando ao menu principal...");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } while (opcao != 4);
        
            scanner.close();
        }
        
        private static void adicionarFuncionário() {
            Scanner scanner = new Scanner(System.in);
        
            System.out.println("Digite o nome do funcionário:");
            String nome = scanner.nextLine();
        
            System.out.println("Digite o cargo do funcionário:");
            String cargo = scanner.nextLine();

            System.out.println("Digite o cargo do funcionário:");
            double salário = scanner.nextDouble();
            
            // Cria um novo funcionário e adiciona à lista
            Funcionarios funcionário = new Funcionarios(nome, cargo, salário);
            funcionário.equals(funcionário);
        
            System.out.println("Funcionário adicionado com sucesso!");
        }
        
       
        
            
        
           
        

    private static void gerarRelatórios() {
        // Implemente a geração de relatórios aqui
        System.out.println("Gerando relatórios....");
    }
}

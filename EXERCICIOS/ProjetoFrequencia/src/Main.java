import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastrar jogadores
        List<Jogador> jogadores = Jogador.cadastrar();


         // Criar instâncias das equipes
        Equipa equipe1 = new Equipa("Equipe1", "Barcelona", LocalDate.of(2000, 1, 1), jogadores);
        Equipa equipe2 = new Equipa("Equipe2", "Real Madrige", LocalDate.of(2000, 1, 1), jogadores);

        // Relacionar jogadores nas equipes
        equipe1.relacionarJogadores();
        equipe2.relacionarJogadores();

         // Imprimir escalação inicial
         System.out.println("\nEscalação Inicial:");
         equipe1.imprimirEscalacao();
         equipe2.imprimirEscalacao();

         // Criar instância do jogo
        Jogo jogo = new Jogo(equipe1, equipe2, LocalDate.of(2024, 5, 24), "Estadio X", "Cidade Y");

        // Gerar eventos aleatórios antes do jogo
        jogo.gerarLesoes();
        jogo.gerarCartoes();
        jogo.permitirTreinamento();

        // Imprimir escalação após eventos
        System.out.println("\nEscalacao Apos Eventos:");
        equipe1.imprimirEscalacao();
        equipe2.imprimirEscalacao();

        // Executar o jogo
        jogo.gerarResultado();
        System.out.println("\nResultado do Jogo:");
        System.out.println("Placar: " + equipe1.getNome() + " " + jogo.getPlacarMandante() + " x " + jogo.getPlacarVisitante() + " " + equipe2.getNome());

        // Cumprir suspensões
        equipe1.getPlantel().forEach(Jogador::cumprirSuspencao);
        equipe2.getPlantel().forEach(Jogador::cumprirSuspencao);

        // Imprimir escalação após cumprir suspensões
        System.out.println("\nEscalacao Apos Cumprimento de Suspensoes:");
        equipe1.imprimirEscalacao();
        equipe2.imprimirEscalacao();

        // Imprimir plantel
        if (!jogadores.isEmpty()) {
            Jogador primeiroJogador = jogadores.get(0);
            primeiroJogador.imprimirPlantel(jogadores);
        } else {
            System.out.println("Nenhum jogador cadastrado.");
        }

        
        // Testar funcionalidades individuais para um jogador
        System.out.println("Escolha um jogador para testar as funcionalidades (de 1 a 11): ");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        Jogador jogadorEscolhido = jogadores.get(escolha - 1);
        System.out.println("Nome do jogador escolhido: " + jogadorEscolhido.getNome());
        System.out.println("Aplicando 2 cartoes ao jogador...");
        jogadorEscolhido.aplicarCartao(2);
        System.out.println("Condicao de jogo apos aplicar cartoes: " + (jogadorEscolhido.verificarCondicaoJogo() ? "Apto" : "Suspenso"));
        System.out.println("Cumprindo suspensao...");
        jogadorEscolhido.cumprirSuspencao();
        System.out.println("Condição de jogo apos cumprir suspensão: " + (jogadorEscolhido.verificarCondicaoJogo() ? "Apto" : "Suspenso"));
        System.out.println("Sofrendo lesão...");
        jogadorEscolhido.sofrerLesao();
        System.out.println("Qualidade do jogador apos sofrer lesão: " + jogadorEscolhido.getQualidade());
        System.out.println("Executando treinamento...");
        jogadorEscolhido.executarTreinamento();
        System.out.println("Qualidade do jogador apos treinamento: " + jogadorEscolhido.getQualidade());



        
        scanner.close();
    }
}

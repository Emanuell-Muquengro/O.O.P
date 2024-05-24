import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Jogador {
    private static int idCounter = 1;
    private int id;
    private String nome;
    private String apelido;
    private LocalDate dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;
    private int cartoes;
    private boolean suspenso;
    private boolean treinado;

    public Jogador(String nome, String apelido, String dataNascimento, int numero, String posicao, int qualidade) {
        this.id = idCounter++;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = 0;
        this.suspenso = false;
        this.treinado = false;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getApelido() {
        return apelido;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getQualidade() {
        return qualidade;
    }

    public int getCartoes() {
        return cartoes;
    }

    public boolean isSuspenso() {
        return suspenso;
    }
    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }

    public boolean isTreinado() {
        return treinado;
    }

    public void setTreinado(boolean treinado) {
        this.treinado = treinado;
    }

    public static List<Jogador> cadastrar() {
        List<Jogador> jogadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 11; i++) {
            System.out.println("Cadastrar jogador " + i + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Apelido: ");
            String apelido = scanner.nextLine();
            System.out.print("Data de Nascimento (dd/MM/yyyy): ");
            String dataNascimento = scanner.nextLine();
            if (dataNascimento.isEmpty()) {
                System.out.println("Data de Nascimento nao pode ser vazia. Por favor, insira novamente.");
                continue; // Volta ao início do loop para pedir novamente a entrada
            }
            System.out.println("Data de Nascimento inserida: " + dataNascimento);
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha
            System.out.print("Posicao: ");
            String posicao = scanner.nextLine();
            System.out.print("Qualidade (0-100): ");
            int qualidade = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            Jogador jogador = new Jogador(nome, apelido, dataNascimento, numero, posicao, qualidade);
            jogadores.add(jogador);
        }
        return jogadores;
    }

    public boolean verificarCondicaoJogo() {
        return !suspenso;
    }

    public void imprimirPlantel(List<Jogador> jogadores) {
        System.out.println("JOGADORES CADASTRADOS");
        for (Jogador jogador : jogadores) {
            String condicao = jogador.verificarCondicaoJogo() ? "TA PRA JOGO" : "SUSPENSO";
            System.out.printf("%s: %d - %s (%s) - %s CONDIÇÃO: %s%n",
                    jogador.getPosicao(),
                    jogador.getNumero(),
                    jogador.getNome(),
                    jogador.getApelido(),
                    jogador.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                    condicao);
        }
    }

    public void aplicarCartao(int quantidade) {
        this.cartoes += quantidade;
        if (this.cartoes >= 3) {
            this.suspenso = true;
        }
    }

    public void cumprirSuspencao() {
        this.cartoes = 0;
        this.suspenso = false;
    }

    public void sofrerLesao() {
        Random random = new Random();
        int chance = random.nextInt(100) + 1;
        int decremento;

        if (chance <= 5) {
            decremento = (int) (0.15 * this.qualidade);
        } else if (chance <= 15) {
            decremento = (int) (0.10 * this.qualidade);
        } else if (chance <= 30) {
            decremento = (int) (0.05 * this.qualidade);
        } else if (chance <= 60) {
            decremento = 2;
        } else {
            decremento = 0;
        }

        this.qualidade -= decremento;
        if (this.qualidade < 0) {
            this.qualidade = 0;
        }
    }

    public void executarTreinamento() {
        if (this.treinado) {
            System.out.println("O jogador já treinou antes da proxima partida.");
            return;
        }

        Random random = new Random();
        int chance = random.nextInt(100) + 1;
        int incremento;

        if (chance <= 5) {
            incremento = 5;
        } else if (chance <= 15) {
            incremento = 4;
        } else if (chance <= 30) {
            incremento = 3;
        } else if (chance <= 60) {
            incremento = 2;
        } else {
            incremento = 1;
        }

        this.qualidade += incremento;
        if (this.qualidade > 100) {
            this.qualidade = 100;
        }

        this.treinado = true;
    }
    
}

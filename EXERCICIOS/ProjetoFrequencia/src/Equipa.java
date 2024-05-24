import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Equipa {
    private String nome;
    private String apelido;
    private LocalDate fundacao;
    private List<Jogador> plantel;
    private List<Jogador> relacionados;

    public Equipa() {
        this.plantel = new ArrayList<>();
        this.relacionados = new ArrayList<>();
    }

    public Equipa(String nome, String apelido, LocalDate fundacao, List<Jogador> plantel) {
        this.nome = nome;
        this.apelido = apelido;
        this.fundacao = fundacao;
        this.plantel = plantel;
        this.relacionados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public void setFundacao(LocalDate fundacao) {
        this.fundacao = fundacao;
    }

    public List<Jogador> getPlantel() {
        return plantel;
    }

    public void setPlantel(List<Jogador> plantel) {
        this.plantel = plantel;
    }

    public List<Jogador> getRelacionados() {
        return relacionados;
    }

    public void setRelacionados(List<Jogador> relacionados) {
        this.relacionados = relacionados;
    }

    public List<Jogador> relacionarJogadores() {
        List<Jogador> titulares = plantel.stream()
                .filter(jogador -> !jogador.isSuspenso())
                .sorted(Comparator.comparingInt(Jogador::getQualidade).reversed())
                .limit(11)
                .collect(Collectors.toList());

        List<Jogador> reservas = plantel.stream()
                .filter(jogador -> !jogador.isSuspenso() && !titulares.contains(jogador))
                .sorted(Comparator.comparingInt(Jogador::getQualidade).reversed())
                .limit(7)
                .collect(Collectors.toList());

        relacionados.clear();
        relacionados.addAll(titulares);
        relacionados.addAll(reservas);

        return relacionados;
    }

    public List<Jogador> relacionarMelhoresJogadores() {
        relacionados = plantel.stream()
                .filter(jogador -> !jogador.isSuspenso())
                .sorted(Comparator.comparingInt(Jogador::getQualidade).reversed())
                .limit(11)
                .collect(Collectors.toList());

        return relacionados;
    }

    public void imprimirEscalacao() {
        System.out.println("EQUIPA: " + nome + " (" + apelido + ")");
        System.out.println("Fundacao: " + fundacao);

        System.out.println("TITULARES:");
        for (int i = 0; i < 11; i++) {
            Jogador jogador = relacionados.get(i);
            System.out.printf("%d - %s (%s) - Qualidade: %d%n", jogador.getNumero(), jogador.getNome(), jogador.getPosicao(), jogador.getQualidade());
        }

        System.out.println("RESERVAS:");
        for (int i = 11; i < relacionados.size(); i++) {
            Jogador jogador = relacionados.get(i);
            System.out.printf("%d - %s (%s) - Qualidade: %d%n", jogador.getNumero(), jogador.getNome(), jogador.getPosicao(), jogador.getQualidade());
        }
    }
}

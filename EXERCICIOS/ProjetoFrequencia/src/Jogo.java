import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.List;

public class Jogo {
    private Equipa mandante;
    private Equipa visitante;
    private LocalDate dataDoJogo;
    private String estadio;
    private String cidade;
    private Integer placarMandante;
    private Integer placarVisitante;

    public Jogo() {}

    public Jogo(Equipa mandante, Equipa visitante, LocalDate dataDoJogo, String estadio, String cidade) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.dataDoJogo = dataDoJogo;
        this.estadio = estadio;
        this.cidade = cidade;
        this.placarMandante = 0;
        this.placarVisitante = 0;
    }

    public Equipa getMandante() {
        return mandante;
    }

    public void setMandante(Equipa mandante) {
        this.mandante = mandante;
    }

    public Equipa getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipa visitante) {
        this.visitante = visitante;
    }

    public LocalDate getDataDoJogo() {
        return dataDoJogo;
    }

    public void setDataDoJogo(LocalDate dataDoJogo) {
        this.dataDoJogo = dataDoJogo;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getPlacarMandante() {
        return placarMandante;
    }

    public void setPlacarMandante(Integer placarMandante) {
        this.placarMandante = placarMandante;
    }

    public Integer getPlacarVisitante() {
        return placarVisitante;
    }

    public void setPlacarVisitante(Integer placarVisitante) {
        this.placarVisitante = placarVisitante;
    }

    public void gerarResultado() {
        int qualidadeMandante = mandante.getRelacionados().stream().mapToInt(Jogador::getQualidade).sum();
        int qualidadeVisitante = visitante.getRelacionados().stream().mapToInt(Jogador::getQualidade).sum();

        Random random = new Random();
        int chance = random.nextInt(100) + 1;

        if (qualidadeMandante > qualidadeVisitante) {
            if (chance <= 50) {
                placarMandante = random.nextInt(5);
                placarVisitante = random.nextInt(placarMandante + 1);
            } else if (chance <= 80) {
                placarVisitante = random.nextInt(5);
                placarMandante = random.nextInt(placarVisitante + 1);
            } else {
                placarMandante = random.nextInt(4);
                placarVisitante = placarMandante;
            }
        } else {
            if (chance <= 50) {
                placarVisitante = random.nextInt(5);
                placarMandante = random.nextInt(placarVisitante + 1);
            } else if (chance <= 80) {
                placarMandante = random.nextInt(5);
                placarVisitante = random.nextInt(placarMandante + 1);
            } else {
                placarMandante = random.nextInt(4);
                placarVisitante = placarMandante;
            }
        }
    }

    public void gerarLesoes() {
        Random random = new Random();
        int lesoes = random.nextInt(3);

        for (int i = 0; i < lesoes; i++) {
            boolean isMandante = random.nextBoolean();
        List<Jogador> jogadores = isMandante ? mandante.getRelacionados() : visitante.getRelacionados();
        Jogador jogador = jogadores.get(random.nextInt(jogadores.size()));
        jogador.sofrerLesao();
        }
    }

    public void gerarCartoes() {
        Random random = new Random();
        int cartoes = random.nextInt(11);

        for (int i = 0; i < cartoes; i++) {
            boolean isMandante = random.nextBoolean();
            List<Jogador> jogadores = isMandante ? mandante.getRelacionados() : visitante.getRelacionados();
            Jogador jogador = jogadores.get(random.nextInt(jogadores.size()));
            jogador.aplicarCartao(1);

            if (random.nextBoolean()) {
                jogador.aplicarCartao(1);
                jogador.setSuspenso(true);
            }
        }
    }

    public void permitirTreinamento() {
        mandante.getPlantel().forEach(jogador -> jogador.setTreinado(false));
        visitante.getPlantel().forEach(jogador -> jogador.setTreinado(false));
    }
}

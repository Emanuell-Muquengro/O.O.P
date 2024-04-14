import java.util.List;

public class Partida {
    private int numeroPartida;
    private List<Equipa> equipas;

    // Construtor
    public Partida(int numeroPartida, List<Equipa> equipas) {
        this.numeroPartida = numeroPartida;
        this.equipas = equipas;
    }

    // Getters e setters
    public int getNumeroPartida() {
        return numeroPartida;
    }

    public void setNumeroPartida(int numeroPartida) {
        this.numeroPartida = numeroPartida;
    }

    public List<Equipa> getEquipes() {
        return equipas;
    }

    public void setEquipes(List<Equipa> equipas) {
        this.equipas = equipas;
    }

    // Outros métodos relacionados às partidas
}

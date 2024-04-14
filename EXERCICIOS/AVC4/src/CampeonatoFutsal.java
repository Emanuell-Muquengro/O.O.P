import java.time.LocalDate;
import java.util.List;

public class CampeonatoFutsal implements Campeonato {
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private List<Equipa> equipasParticipantes;
    private List<Partida> partidas;

    // Construtor
    public CampeonatoFutsal(LocalDate dataInicio, LocalDate dataFim, List<Equipa> equipasParticipantes, List<Partida> partidas) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.equipasParticipantes = equipasParticipantes;
        this.partidas = partidas;
    }

    // Implementação dos métodos da interface Campeonato
    @Override
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    @Override
    public LocalDate getDataFim() {
        return dataFim;
    }

    @Override
    public List<Equipa> getEquipasParticipantes() {
        return equipasParticipantes;
    }

    // Getter e setter para partidas
    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }

    // Outros métodos relacionados aos campeonatos de futsal
}

import java.time.LocalDate;
import java.util.List;

// Interface Campeonato
public interface Campeonato {
    LocalDate getDataInicio(); // Retorna a data de início do campeonato
    LocalDate getDataFim(); // Retorna a data de fim do campeonato
    List<Equipa> getEquipasParticipantes(); // Retorna a lista de equipas participantes do campeonato
    // Outros métodos relacionados aos campeonatos
}

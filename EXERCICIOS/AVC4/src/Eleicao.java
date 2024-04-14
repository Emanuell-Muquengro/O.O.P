import java.time.LocalDate;
import java.util.List;

public class Eleicao {
    private LocalDate data;
    private List<SocioDirigente> eleitos;

    // Construtor
    public Eleicao(LocalDate data, List<SocioDirigente> eleitos) {
        this.data = data;
        this.eleitos = eleitos;
    }

    // Getters e setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<SocioDirigente> getEleitos() {
        return eleitos;
    }

    public void setEleitos(List<SocioDirigente> eleitos) {
        this.eleitos = eleitos;
    }

    // Outros métodos relacionados às eleições
}

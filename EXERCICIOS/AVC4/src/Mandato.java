import java.time.LocalDate;

public class Mandato {
    private int anoInicio;
    private int anoFim;
    private SocioDirigente dirigente;

    // Construtor
    public Mandato(int anoInicio, int anoFim, SocioDirigente dirigente) {
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
        this.dirigente = dirigente;
    }

    // Getters e setters
    public int getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public int getAnoFim() {
        return anoFim;
    }

    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }

    public SocioDirigente getDirigente() {
        return dirigente;
    }

    public void setDirigente(SocioDirigente dirigente) {
        this.dirigente = dirigente;
    }

    // Outros métodos relacionados aos mandatos
}

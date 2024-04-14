import java.time.LocalDate;

public class SocioDirigente extends SocioBase {
    private int anosMandato;

    // Construtor
    public SocioDirigente(String nome, int numeroSocio, LocalDate dataInscricao, boolean quotasEmDia, int anosMandato) {
        super(nome, numeroSocio, dataInscricao, quotasEmDia);
        this.anosMandato = anosMandato;
    }

    // Método para verificar se o sócio é dirigente
    @Override
    public boolean isDirigente() {
        return true;
    }

    // Método para verificar se o sócio é honorário (não é dirigente)
    @Override
    public boolean isHonorario() {
        return false;
    }

    // Getter para anos de mandato
    public int getAnosMandato() {
        return anosMandato;
    }

    // Setter para anos de mandato
    public void setAnosMandato(int anosMandato) {
        this.anosMandato = anosMandato;
    }

    // Outros métodos específicos dos sócios dirigentes
}

import java.time.LocalDate;

public class SocioOrdinario extends SocioBase {
    private Atividade atividadeInscrita;

    // Construtor
    public SocioOrdinario(String nome, int numeroSocio, LocalDate dataInscricao, boolean quotasEmDia, Atividade atividadeInscrita) {
        super(nome, numeroSocio, dataInscricao, quotasEmDia);
        this.atividadeInscrita = atividadeInscrita;
    }

    // Método para verificar se o sócio é dirigente
    @Override
    public boolean isDirigente() {
        return false;
    }

    // Método para verificar se o sócio é honorário
    @Override
    public boolean isHonorario() {
        return false;
    }

    // Getter para atividade inscrita
    public Atividade getAtividadeInscrita() {
        return atividadeInscrita;
    }

    // Setter para atividade inscrita
    public void setAtividadeInscrita(Atividade atividadeInscrita) {
        this.atividadeInscrita = atividadeInscrita;
    }

    // Outros métodos específicos dos sócios ordinários
}

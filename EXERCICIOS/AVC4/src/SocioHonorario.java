import java.time.LocalDate;

public class SocioHonorario extends SocioBase {
    // Construtor
    public SocioHonorario(String nome, int numeroSocio, LocalDate dataInscricao, boolean quotasEmDia) {
        super(nome, numeroSocio, dataInscricao, quotasEmDia);
    }

    // Método para verificar se o sócio é dirigente
    @Override
    public boolean isDirigente() {
        return false;
    }

    // Método para verificar se o sócio é honorário
    @Override
    public boolean isHonorario() {
        return true;
    }

    // Outros métodos específicos dos sócios honorários
}

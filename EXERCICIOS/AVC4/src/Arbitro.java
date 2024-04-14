import java.time.LocalDate;

public class Arbitro extends SocioBase {
    // Construtor
    public Arbitro(String nome, int numeroSocio, LocalDate dataInscricao, boolean quotasEmDia) {
        super(nome, numeroSocio, dataInscricao, quotasEmDia);
    }

    // Método para verificar se o árbitro é dirigente (no contexto do futsal)
    @Override
    public boolean isDirigente() {
        return false;
    }

    // Método para verificar se o árbitro é honorário (no contexto do futsal)
    @Override
    public boolean isHonorario() {
        return true;
    }

    // Outros métodos relacionados aos árbitros
}

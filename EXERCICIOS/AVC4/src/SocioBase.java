import java.time.LocalDate;

// Classe abstrata SocioBase
public abstract class SocioBase implements Socio {
    private String nome;
    private int numeroSocio;
    private LocalDate dataInscricao;
    private boolean quotasEmDia;

    // Construtor
    public SocioBase(String nome, int numeroSocio, LocalDate dataInscricao, boolean quotasEmDia) {
        this.nome = nome;
        this.numeroSocio = numeroSocio;
        this.dataInscricao = dataInscricao;
        this.quotasEmDia = quotasEmDia;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public LocalDate getDataInscricao() {
        return dataInscricao;
    }

    public boolean temQuotasEmDia() {
        return quotasEmDia;
    }

    public void pagarQuotas() {
        quotasEmDia = true;
    }

    public void atrasarQuotas() {
        quotasEmDia = false;
    }

    // Método para atualizar a data de inscrição
    public void atualizarDataInscricao(LocalDate novaData) {
        this.dataInscricao = novaData;
    }

    // Método para verificar se o sócio é dirigente
    public abstract boolean isDirigente();

    // Método para verificar se o sócio é honorário
    public abstract boolean isHonorario();

    // Outros métodos comuns aos sócios
}

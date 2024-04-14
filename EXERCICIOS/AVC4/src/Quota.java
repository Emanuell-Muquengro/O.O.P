import java.time.LocalDate;

public class Quota {
    private int ano;
    private boolean pago;
    private LocalDate dataPagamento;

    // Construtor
    public Quota(int ano, boolean pago, LocalDate dataPagamento) {
        this.ano = ano;
        this.pago = pago;
        this.dataPagamento = dataPagamento;
    }

    // Getters e setters
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    // Outros métodos relacionados às quotas
}

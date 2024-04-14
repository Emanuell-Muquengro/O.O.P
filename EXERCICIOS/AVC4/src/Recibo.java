import java.time.LocalDate;

public class Recibo {
    private int numero;
    private LocalDate dataEmissao;
    private Socio socio;
    private int anoQuota;

    // Construtor
    public Recibo(int numero, LocalDate dataEmissao, Socio socio, int anoQuota) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.socio = socio;
        this.anoQuota = anoQuota;
    }

    // Getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public int getAnoQuota() {
        return anoQuota;
    }

    public void setAnoQuota(int anoQuota) {
        this.anoQuota = anoQuota;
    }

    // Outros métodos relacionados aos recibos
}

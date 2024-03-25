import java.util.Date;

/**
 * Representa uma reserva de imóvel na imobiliária.
 */
public class Reserva {
    private Imovel imovel;
    private Cliente cliente;
    private Date dataReserva;

    /**
     * Construtor da classe Reserva.
     * 
     * @param imovel       O imóvel reservado.
     * @param cliente      O cliente que fez a reserva.
     * @param dataReserva  A data em que a reserva foi feita.
     */
    public Reserva(Imovel imovel, Cliente cliente, Date dataReserva) {
        this.imovel = imovel;
        this.cliente = cliente;
        this.dataReserva = dataReserva;
    }

    /**
     * Retorna o imóvel reservado.
     * 
     * @return O imóvel reservado.
     */
    public Imovel getImovel() {
        return imovel;
    }

    /**
     * Define o imóvel reservado.
     * 
     * @param imovel O imóvel reservado.
     */
    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    /**
     * Retorna o cliente que fez a reserva.
     * 
     * @return O cliente que fez a reserva.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente que fez a reserva.
     * 
     * @param cliente O cliente que fez a reserva.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Retorna a data da reserva.
     * 
     * @return A data da reserva.
     */
    public Date getDataReserva() {
        return dataReserva;
    }

    /**
     * Define a data da reserva.
     * 
     * @param dataReserva A data da reserva.
     */
    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }
}

import java.util.Date;

/**
 * Representa uma venda de imóvel na imobiliária.
 */
public class Venda {
    private String agencia;
    private Date data;
    private Funcionario vendedor;
    private Imovel imovel;
    private Proprietario proprietario;
    private Cliente clienteComprador;

    /**
     * Construtor da classe Venda.
     * 
     * @param agencia            A agência onde a venda foi realizada.
     * @param data               A data da venda.
     * @param vendedor           O funcionário que realizou a venda.
     * @param imovel             O imóvel vendido.
     * @param proprietario       O proprietário do imóvel vendido.
     * @param clienteComprador   O cliente que comprou o imóvel.
     */
    public Venda(String agencia, Date data, Funcionario vendedor, Imovel imovel, Proprietario proprietario, Cliente clienteComprador) {
        this.agencia = agencia;
        this.data = data;
        this.vendedor = vendedor;
        this.imovel = imovel;
        this.proprietario = proprietario;
        this.clienteComprador = clienteComprador;
    }

    /**
     * Retorna a agência onde a venda foi realizada.
     * 
     * @return A agência onde a venda foi realizada.
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define a agência onde a venda foi realizada.
     * 
     * @param agencia A nova agência onde a venda foi realizada.
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Retorna a data da venda.
     * 
     * @return A data da venda.
     */
    public Date getData() {
        return data;
    }

    /**
     * Define a data da venda.
     * 
     * @param data A nova data da venda.
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * Retorna o funcionário que realizou a venda.
     * 
     * @return O funcionário que realizou a venda.
     */
    public Funcionario getVendedor() {
        return vendedor;
    }

    /**
     * Define o funcionário que realizou a venda.
     * 
     * @param vendedor O novo funcionário que realizou a venda.
     */
    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * Retorna o imóvel vendido.
     * 
     * @return O imóvel vendido.
     */
    public Imovel getImovel() {
        return imovel;
    }

    /**
     * Define o imóvel vendido.
     * 
     * @param imovel O novo imóvel vendido.
     */
    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    /**
     * Retorna o proprietário do imóvel vendido.
     * 
     * @return O proprietário do imóvel vendido.
     */
    public Proprietario getProprietario() {
        return proprietario;
    }

    /**
     * Define o proprietário do imóvel vendido.
     * 
     * @param proprietario O novo proprietário do imóvel vendido.
     */
    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * Retorna o cliente que comprou o imóvel.
     * 
     * @return O cliente que comprou o imóvel.
     */
    public Cliente getClienteComprador() {
        return clienteComprador;
    }

    /**
     * Define o cliente que comprou o imóvel.
     * 
     * @param clienteComprador O novo cliente que comprou o imóvel.
     */
    public void setClienteComprador(Cliente clienteComprador) {
        this.clienteComprador = clienteComprador;
    }
}

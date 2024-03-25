/**
 * Representa um proprietário de imóveis no sistema imobiliário.
 */
public class Proprietario extends Pessoa {
    private boolean aprovado;

    /**
     * Construtor da classe Proprietario.
     * 
     * @param nome     O nome do proprietário.
     * @param email    O email do proprietário.
     * @param telefone O telefone do proprietário.
     */
    public Proprietario(String nome, String email, String telefone) {
        super(nome, email, telefone);
        this.aprovado = false;
    }

    /**
     * Verifica se o proprietário está aprovado pela imobiliária.
     * 
     * @return true se estiver aprovado, false caso contrário.
     */
    public boolean estaAprovado() {
        return aprovado;
    }

    /**
     * Define se o proprietário está aprovado pela imobiliária.
     * 
     * @param aprovado true se estiver aprovado, false caso contrário.
     */
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    /**
     * Envia um pedido de registro para a imobiliária.
     */
    public void enviarPedidoRegistro() {
        // Implementação do método
    }
}

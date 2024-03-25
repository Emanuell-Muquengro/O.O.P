/**
 * Representa uma vivenda no sistema imobiliário.
 */
public class Vivenda extends Imovel {
    private int numQuartos;

    /**
     * Construtor da classe Vivenda.
     * 
     * @param anoConstrucao O ano de construção da vivenda.
     * @param area          A área da vivenda.
     * @param localizacao   A localização da vivenda.
     * @param preco         O preço da vivenda.
     * @param numQuartos    O número de quartos da vivenda.
     */
    public Vivenda(int anoConstrucao, double area, String localizacao, double preco, int numQuartos) {
        super(anoConstrucao, area, localizacao, preco);
        this.numQuartos = numQuartos;
    }

    /**
     * Retorna o número de quartos da vivenda.
     * 
     * @return O número de quartos da vivenda.
     */
    public int getNumQuartos() {
        return numQuartos;
    }

    /**
     * Define o número de quartos da vivenda.
     * 
     * @param numQuartos O novo número de quartos da vivenda.
     */
    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
}

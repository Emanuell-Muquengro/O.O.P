/**
 * Representa um apartamento no sistema imobiliário.
 */
public class Apartamento extends Imovel {
    private String tipologia;

    /**
     * Construtor da classe Apartamento.
     * 
     * @param anoConstrucao O ano de construção do apartamento.
     * @param area          A área do apartamento.
     * @param localizacao   A localização do apartamento.
     * @param preco         O preço do apartamento.
     * @param tipologia     A tipologia do apartamento (T1, T2, etc.).
     */
    public Apartamento(int anoConstrucao, double area, String localizacao, double preco, String tipologia) {
        super(anoConstrucao, area, localizacao, preco);
        this.tipologia = tipologia;
    }

    /**
     * Retorna a tipologia do apartamento.
     * 
     * @return A tipologia do apartamento.
     */
    public String getTipologia() {
        return tipologia;
    }

    /**
     * Define a tipologia do apartamento.
     * 
     * @param tipologia A nova tipologia do apartamento.
     */
    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }
}

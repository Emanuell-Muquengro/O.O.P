/**
 * Representa um terreno no sistema imobiliário.
 */
public class Terreno extends Imovel {
    private boolean zonaUrbana;

    /**
     * Construtor da classe Terreno.
     * 
     * @param anoConstrucao O ano de construção do terreno.
     * @param area          A área do terreno.
     * @param localizacao   A localização do terreno.
     * @param preco         O preço do terreno.
     * @param zonaUrbana    Indica se o terreno está em zona urbana (true) ou rural (false).
     */
    public Terreno(int anoConstrucao, double area, String localizacao, double preco, boolean zonaUrbana) {
        super(anoConstrucao, area, localizacao, preco);
        this.zonaUrbana = zonaUrbana;
    }

    /**
     * Verifica se o terreno está em zona urbana.
     * 
     * @return true se o terreno está em zona urbana, false se está em zona rural.
     */
    public boolean isZonaUrbana() {
        return zonaUrbana;
    }

    /**
     * Define se o terreno está em zona urbana ou rural.
     * 
     * @param zonaUrbana true se o terreno está em zona urbana, false se está em zona rural.
     */
    public void setZonaUrbana(boolean zonaUrbana) {
        this.zonaUrbana = zonaUrbana;
    }
}

/**
 * Representa um país organizador do campeonato.
 */
class PaisOrganizador extends Pais {
    private String cidade;
    private String estadio;

    /**
     * Cria um novo país organizador com o nome, código FIFA, cidade e estádio especificados.
     * 
     * @param nome O nome do país organizador.
     * @param codigoFifa O código FIFA do país organizador.
     * @param cidade A cidade do país organizador onde ocorrerão os jogos.
     * @param estadio O estádio do país organizador onde ocorrerão os jogos.
     */
    public PaisOrganizador(String nome, String codigoFifa, String cidade, String estadio) {
        super(nome, codigoFifa);
        this.cidade = cidade;
        this.estadio = estadio;
    }

    /**
     * Retorna a cidade do país organizador.
     * 
     * @return A cidade do país organizador.
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Define a cidade do país organizador.
     * 
     * @param cidade A nova cidade do país organizador.
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * Retorna o estádio do país organizador.
     * 
     * @return O estádio do país organizador.
     */
    public String getEstadio() {
        return estadio;
    }

    /**
     * Define o estádio do país organizador.
     * 
     * @param estadio O novo estádio do país organizador.
     */
    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    // Outros métodos relevantes
}

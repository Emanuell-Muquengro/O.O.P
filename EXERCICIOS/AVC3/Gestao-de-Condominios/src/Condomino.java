/**
 * Representa um condômino de um edifício.
 */
public class Condomino {
    private String nome;
    private String email;
    private String edifício;
    private int numero;

    // Construtor
    public Condomino(String nome, int numero, String email, String edifício) {
        this.nome = nome;
        this.email = email;
        this.edifício = edifício;
        this.numero=numero;
    }

    /**
     * Retorna o nome do condômino.
     * 
     * @return O nome do condômino.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do condômino.
     * 
     * @param nome O nome do condômino.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }

    /**
     * Define o nome do condômino.
     * 
     * @param nome O nome do condômino.
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Retorna o email do condômino.
     * 
     * @return O email do condômino.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email do condômino.
     * 
     * @param email O email do condômino.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna o edifício do condômino.
     * 
     * @return O edifício do condômino.
     */
    public String getEdifício() {
        return edifício;
    }

    /**
     * Define o edifício do condômino.
     * 
     * @param edifício O edifício do condômino.
     */
    public void setEdifício(String edifício) {
        this.edifício = edifício;
        
    }

    public void add(Condomino condomino) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    
}

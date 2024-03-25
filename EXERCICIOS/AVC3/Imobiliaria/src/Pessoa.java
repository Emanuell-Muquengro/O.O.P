/**
 * Representa uma pessoa no sistema imobiliário.
 */
public class Pessoa {
    private String nome;
    private String email;
    private String telefone;

    /**
     * Construtor da classe Pessoa.
     * 
     * @param nome     O nome da pessoa.
     * @param email    O email da pessoa.
     * @param telefone O telefone da pessoa.
     */
    public Pessoa(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    /**
     * Retorna o nome da pessoa.
     * 
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome O novo nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o email da pessoa.
     * 
     * @return O email da pessoa.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define o email da pessoa.
     * 
     * @param email O novo email da pessoa.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Retorna o telefone da pessoa.
     * 
     * @return O telefone da pessoa.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o telefone da pessoa.
     * 
     * @param telefone O novo telefone da pessoa.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

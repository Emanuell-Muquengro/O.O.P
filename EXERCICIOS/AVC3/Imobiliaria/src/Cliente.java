/**
 * Representa um cliente no sistema imobiliário.
 */
public class Cliente extends Pessoa {
    private String login;
    private String senha;

    /**
     * Construtor da classe Cliente.
     * 
     * @param nome     O nome do cliente.
     * @param email    O email do cliente.
     * @param telefone O telefone do cliente.
     * @param login    O login do cliente.
     * @param senha    A senha do cliente.
     */
    public Cliente(String nome, String email, String telefone, String login, String senha) {
        super(nome, email, telefone);
        this.login = login;
        this.senha = senha;
    }

    /**
     * Retorna o login do cliente.
     * 
     * @return O login do cliente.
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o login do cliente.
     * 
     * @param login O novo login do cliente.
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Retorna a senha do cliente.
     * 
     * @return A senha do cliente.
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do cliente.
     * 
     * @param senha A nova senha do cliente.
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
}

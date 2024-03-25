/**
 * Representa um jogador de futebol.
 */
class Jogador {
    private String nome;
    private int idade;
    // Outros atributos relevantes

    /**
     * Cria um novo jogador com o nome e idade especificados.
     * 
     * @param nome O nome do jogador.
     * @param idade A idade do jogador.
     */
    public Jogador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        // Inicialize outros atributos, se houver
    }

    /**
     * Retorna o nome do jogador.
     * 
     * @return O nome do jogador.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do jogador.
     * 
     * @param nome O novo nome do jogador.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a idade do jogador.
     * 
     * @return A idade do jogador.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Define a idade do jogador.
     * 
     * @param idade A nova idade do jogador.
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}

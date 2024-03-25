/**
 * Representa uma equipe de futebol.
 */
class Equipe {
    private String nome;
    private Jogador[] jogadores;
    private int numJogadores;

    /**
     * Cria uma nova equipe com o nome especificado e um tamanho máximo de jogadores.
     * 
     * @param nome O nome da equipe.
     * @param tamanhoMaximo O tamanho máximo de jogadores que a equipe pode ter.
     */
    public Equipe(String nome, int tamanhoMaximo) {
        this.nome = nome;
        this.jogadores = new Jogador[tamanhoMaximo];
        this.numJogadores = 0;
    }

    /**
     * Retorna o nome da equipe.
     * 
     * @return O nome da equipe.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da equipe.
     * 
     * @param nome O novo nome da equipe.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o número de jogadores na equipe.
     * 
     * @return O número de jogadores na equipe.
     */
    public int getNumJogadores() {
        return numJogadores;
    }

    /**
     * Adiciona um jogador à equipe.
     * 
     * @param jogador O jogador a ser adicionado.
     */
    public void adicionarJogador(Jogador jogador) {
        if (numJogadores < jogadores.length) {
            jogadores[numJogadores] = jogador;
            numJogadores++;
        } else {
            System.out.println("Limite de jogadores atingido para esta equipe.");
        }
    }

    // Outros métodos relevantes
}

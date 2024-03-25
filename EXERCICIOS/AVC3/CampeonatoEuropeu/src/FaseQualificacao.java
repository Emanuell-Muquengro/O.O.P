/**
 * Representa a fase de qualificação do campeonato.
 */
class FaseQualificacao {
    private String nome;
    private Equipe[][] grupos;
    // Outros atributos relevantes

    /**
     * Cria uma nova fase de qualificação com o nome especificado e o número de grupos.
     * 
     * @param nome O nome da fase de qualificação.
     * @param numGrupos O número de grupos na fase de qualificação.
     */
    public FaseQualificacao(String nome, int numGrupos) {
        this.nome = nome;
        this.grupos = new Equipe[numGrupos][];
        // Inicialize outros atributos, se houver
    }

    /**
     * Retorna o nome da fase de qualificação.
     * 
     * @return O nome da fase de qualificação.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da fase de qualificação.
     * 
     * @param nome O novo nome da fase de qualificação.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna as equipes do grupo especificado.
     * 
     * @param grupoIndex O índice do grupo.
     * @return Um array contendo as equipes do grupo especificado.
     */
    public Equipe[] getEquipesGrupo(int grupoIndex) {
        return grupos[grupoIndex];
    }

    /**
     * Define as equipes do grupo especificado.
     * 
     * @param grupoIndex O índice do grupo.
     * @param equipes Um array contendo as equipes do grupo.
     */
    public void setEquipesGrupo(int grupoIndex, Equipe[] equipes) {
        grupos[grupoIndex] = equipes;
    }

    // Outros métodos relevantes
}

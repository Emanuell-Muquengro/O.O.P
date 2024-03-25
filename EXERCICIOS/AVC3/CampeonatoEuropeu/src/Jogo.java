/**
 * Representa um jogo de futebol entre duas equipes.
 */
class Jogo {
    private Equipe equipe1;
    private Equipe equipe2;
    private int golsEquipe1;
    private int golsEquipe2;
    // Outros atributos relevantes

    /**
     * Cria um novo jogo entre duas equipes.
     * 
     * @param equipe1 A primeira equipe.
     * @param equipe2 A segunda equipe.
     */
    public Jogo(Equipe equipe1, Equipe equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    /**
     * Registra um gol para a equipe especificada.
     * 
     * @param equipe A equipe que marcou o gol.
     * @param quantidade A quantidade de gols a serem registrados.
     */
    public void registrarGol(Equipe equipe, int quantidade) {
        if (equipe.equals(equipe1)) {
            golsEquipe1 += quantidade;
        } else if (equipe.equals(equipe2)) {
            golsEquipe2 += quantidade;
        } else {
            System.out.println("Equipe não encontrada.");
        }
    }

    /**
     * Retorna o número de gols marcados pela primeira equipe.
     * 
     * @return O número de gols marcados pela primeira equipe.
     */
    public int getGolsEquipe1() {
        return golsEquipe1;
    }

    /**
     * Retorna o número de gols marcados pela segunda equipe.
     * 
     * @return O número de gols marcados pela segunda equipe.
     */
    public int getGolsEquipe2() {
        return golsEquipe2;
    }

    // Outros métodos relevantes
}

public class App {
    public static void main(String[] args) throws Exception {
        // Criando algumas equipes
        Equipe equipe1 = new Equipe("Portugal", 11);
        equipe1.adicionarJogador(new Jogador("Cristiano Ronaldo", 36));
        // Adicionar mais jogadores à equipe1

        Equipe equipe2 = new Equipe("Espanha", 11);
        equipe2.adicionarJogador(new Jogador("Sergio Ramos", 35));
        // Adicionar mais jogadores à equipe2

        // Criando um país organizador
        PaisOrganizador paisOrganizador = new PaisOrganizador("França", "FRA", "Paris", "Stade de France");

        // Criando uma fase de qualificação
        FaseQualificacao faseQualificacao = new FaseQualificacao("Qualificação", 2);
        faseQualificacao.setEquipesGrupo(0, new Equipe[]{equipe1});
        faseQualificacao.setEquipesGrupo(1, new Equipe[]{equipe2});

        // Simulando alguns jogos
        Jogo jogo1 = new Jogo(equipe1, equipe2);
        jogo1.registrarGol(equipe1, 2);
        jogo1.registrarGol(equipe2, 1);

        // Exibindo resultados
        System.out.println("Resultado do jogo:");
        System.out.println(equipe1.getNome() + " " + jogo1.getGolsEquipe1() + " x " + jogo1.getGolsEquipe2() + " " + equipe2.getNome());
    }
}

import java.util.Arrays;

/**
 * Representa um condomínio gerenciado pela empresa de gestão de condomínios.
 */
public class Condominios {
    private String nome;
    private Edificio[] edifícios;
    private Funcionarios[] funcionários;
    private int numEdifícios;
    private int numFuncionários;

    /**
     * Construtor da classe Condomínio.
     * 
     * @param nome              O nome do condomínio.
     * @param capacidadeEdifícios   A capacidade máxima de edifícios que o condomínio pode ter.
     * @param capacidadeFuncionários    A capacidade máxima de funcionários que o condomínio pode ter.
     */
    public Condominios(String nome, int capacidadeEdifícios, int capacidadeFuncionários) {
        this.nome = nome;
        this.edifícios = new Edificio[capacidadeEdifícios];
        this.funcionários = new Funcionarios[capacidadeFuncionários];
        this.numEdifícios = 0;
        this.numFuncionários = 0;
    }

    /**
     * Adiciona um edifício ao condomínio.
     * 
     * @param edifício O edifício a ser adicionado.
     */
    public void adicionarEdifício(Edificio edifício) {
        if (numEdifícios < edifícios.length) {
            edifícios[numEdifícios] = edifício;
            numEdifícios++;
        } else {
            System.out.println("Capacidade máxima de edifícios atingida.");
        }
    }

    /**
     * Adiciona um funcionário ao condomínio.
     * 
     * @param funcionário O funcionário a ser adicionado.
     */
    public void adicionarFuncionário(Funcionarios funcionário) {
        if (numFuncionários < funcionários.length) {
            funcionários[numFuncionários] = funcionário;
            numFuncionários++;
        } else {
            System.out.println("Capacidade máxima de funcionários atingida.");
        }
    }

    // Métodos getters e setters omitidos para economia de espaço

    /**
     * Retorna uma representação em string do objeto Condomínio.
     * 
     * @return Uma string representando o objeto Condomínio.
     */
    @Override
    public String toString() {
        return "Condomínio [nome=" + nome + ", edifícios=" + Arrays.toString(edifícios) + ", funcionários="
                + Arrays.toString(funcionários) + ", numEdifícios=" + numEdifícios + ", numFuncionários="
                + numFuncionários + "]";
    }
}

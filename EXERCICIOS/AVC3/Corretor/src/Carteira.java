/**
 * Classe que representa uma carteira de títulos de participação.
 */
public class Carteira {
    private TituloParticipacao[] titulos;
    private int[] quantidades;
    private int tamanho;

    /**
     * Construtor da classe Carteira.
     */
    public Carteira(int capacidade) {
        titulos = new TituloParticipacao[capacidade];
        quantidades = new int[capacidade];
        tamanho = 0;
    }

    /**
     * Método para adicionar um título à carteira.
     */
    public void adicionarTitulo(TituloParticipacao titulo, int quantidade) {
        if (tamanho < titulos.length) {
            titulos[tamanho] = titulo;
            quantidades[tamanho] = quantidade;
            tamanho++;
        } else {
            System.out.println("Carteira cheia. Não é possível adicionar mais títulos.");
        }
    }

    /**
     * Método para remover um título da carteira.
     */
    public void removerTitulo(TituloParticipacao titulo, int quantidade) {
        for (int i = 0; i < tamanho; i++) {
            if (titulos[i].equals(titulo)) {
                if (quantidades[i] > quantidade) {
                    quantidades[i] -= quantidade;
                } else {
                    // Remover o título se a quantidade desejada for maior ou igual à quantidade na carteira
                    titulos[i] = null;
                    quantidades[i] = 0;
                    compactar(i);
                    tamanho--;
                }
                return;
            }
        }
    }

    /**
     * Método para compactar o vetor após remover um título da carteira.
     */
    private void compactar(int posicao) {
        for (int i = posicao; i < tamanho - 1; i++) {
            titulos[i] = titulos[i + 1];
            quantidades[i] = quantidades[i + 1];
        }
        titulos[tamanho - 1] = null;
        quantidades[tamanho - 1] = 0;
    }

    /**
     * Método para exibir os detalhes da carteira.
     */
    public void exibirDetalhes() {
        System.out.println("Carteira:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("   - " + titulos[i].getDesignacao() + " (Quantidade: " + quantidades[i] + ")");
        }
    }

    // Outros métodos e implementações podem ser adicionados conforme necessário
}

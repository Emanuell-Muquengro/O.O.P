public class Livro {
    private String titulo; // Título do livro
    private int duracaoEmMinutos; // Duração do livro em minutos

    /**
     * Construtor da classe Livro.
     * @param titulo O título do livro.
     * @param duracaoEmMinutos A duração do livro em minutos.
     */
    public Livro(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    /**
     * Método de acesso para obter o título do livro.
     * @return O título do livro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método de acesso para definir o título do livro.
     * @param titulo O novo título do livro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método de acesso para obter a duração do livro em minutos.
     * @return A duração do livro em minutos.
     */
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    /**
     * Método de acesso para definir a duração do livro em minutos.
     * @param duracaoEmMinutos A nova duração do livro em minutos.
     */
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    /**
     * Método que exibe a duração do livro em horas e minutos.
     */
    public void exibirDuracaoEmHoras() {
        int horas = duracaoEmMinutos / 60;
        int minutos = duracaoEmMinutos % 60;
        System.out.println("O livro " + titulo + " possui " + horas + " horas e " + minutos + " minutos de duração");
    }
}

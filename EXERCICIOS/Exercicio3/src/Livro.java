public class Livro {
    private String titulo; // Título do livro
    private Integer qtdPaginas; // Quantidade total de páginas do livro
    private Integer paginasLidas; // Quantidade de páginas já lidas do livro

    /**
     * Construtor padrão da classe Livro.
     */
    public Livro() {
    }

    /**
     * Construtor da classe Livro que inicializa o título e a quantidade de páginas do livro.
     * @param titulo O título do livro.
     * @param qtdPaginas A quantidade total de páginas do livro.
     */
    public Livro(String titulo, Integer qtdPaginas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
        this.paginasLidas = 0; // Inicializa paginasLidas como 0 quando um novo livro é criado
    }

    // Métodos get e set para os atributos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(Integer qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public Integer getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(Integer paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    // Método para verificar o progresso de leitura
    public void verificarProgresso() {
        double progresso = (double) paginasLidas * 100 / qtdPaginas;
        System.out.println("Você já leu " + progresso + "% do livro.");
    }
}

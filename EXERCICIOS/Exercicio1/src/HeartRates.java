public class HeartRates {
    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    /**
     * Construtor para criar um objeto HeartRates com informações pessoais.
     *
     * @param nome           o nome da pessoa
     * @param sobrenome      o sobrenome da pessoa
     * @param diaNascimento  o dia de nascimento da pessoa
     * @param mesNascimento  o mês de nascimento da pessoa
     * @param anoNascimento  o ano de nascimento da pessoa
     */
    
    
    // Construtor
    public HeartRates(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
    }

    // Métodos set e get para cada atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
    
     /**
     * Calcula a idade da pessoa com base no ano atual.
     *
     * @param anoAtual o ano atual
     * @return a idade da pessoa
     */

    // Método para calcular a idade
    public int calcularIdade(int anoAtual) {
        return anoAtual - this.anoNascimento;
    }
/**
     * Calcula a frequência cardíaca máxima da pessoa.
     *
     * @param anoNascimento
     * @return a frequência cardíaca máxima da pessoa
     */
    // Método para calcular a frequência cardíaca máxima
    public int calcularFrequenciaMaxima() {
    int idade = calcularIdade(2024);
    return 220 - idade;
}
     /**
     * Calcula a frequência cardíaca alvo da pessoa.
     *
     * @return a frequência cardíaca alvo da pessoa, no formato "min-max"
     */

    // Método para calcular a frequência cardíaca alvo
  public String calcularFrequenciaAlvo() {
    int frequenciaMaxima = calcularFrequenciaMaxima();
    double alvoMinimo = 0.5 * frequenciaMaxima; // 50% da frequência máxima
    double alvoMaximo = 0.85 * frequenciaMaxima; // 85% da frequência máxima
    return String.format("%.0f - %.0f bpm", alvoMinimo, alvoMaximo); // Ajuste na formatação da string
}
}

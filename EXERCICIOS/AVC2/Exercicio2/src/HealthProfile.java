public class HealthProfile {
    private String nome;
    private String sobrenome;
    private char sexo;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private double altura; // em metros
    private double peso; // em quilogramas

    /**
     * Construtor para criar um objeto HealthProfile com os dados fornecidos.
     * 
     * @param nome           O nome da pessoa.
     * @param sobrenome      O sobrenome da pessoa.
     * @param sexo           O sexo da pessoa (M/F).
     * @param diaNascimento  O dia de nascimento da pessoa.
     * @param mesNascimento  O mês de nascimento da pessoa.
     * @param anoNascimento  O ano de nascimento da pessoa.
     * @param altura         A altura da pessoa em metros.
     * @param peso           O peso da pessoa em quilogramas.
     */

    // Construtor
    public HealthProfile(String nome, String sobrenome, char sexo, int diaNascimento, int mesNascimento, int anoNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos set e get para cada atributo

    /**
     * Define o nome da pessoa.
     * 
     * @param nome O nome da pessoa.
     */

    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Obtém o nome da pessoa.
     * 
     * @return O nome da pessoa.
     */

    public String getNome() {
        return nome;
    }

     /**
     * Define o sobrenome da pessoa.
     * 
     * @param sobrenome O sobrenome da pessoa.
     */

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    /**
     * Obtém o sobrenome da pessoa.
     * 
     * @return O sobrenome da pessoa.
     */

    public String getSobrenome() {
        return sobrenome;
    }
    /**
     * Define o sexo da pessoa.
     * 
     * @param sexo O sexo da pessoa (M/F).
     */

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    /**
     * Obtém o sexo da pessoa.
     * 
     * @return O sexo da pessoa (M/F).
     */

    public char getSexo() {
        return sexo;
    }
    /**
     * Define o dia de nascimento da pessoa.
     * 
     * @param diaNascimento O dia de nascimento da pessoa.
     */

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    /**
     * Obtém o dia de nascimento da pessoa.
     * 
     * @return O dia de nascimento da pessoa.
     */

    public int getDiaNascimento() {
        return diaNascimento;
    }
    /**
     * Define o mês de nascimento da pessoa.
     * 
     * @param mesNascimento O mês de nascimento da pessoa.
     */

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    /**
     * Obtém o mês de nascimento da pessoa.
     * 
     * @return O mês de nascimento da pessoa.
     */

    public int getMesNascimento() {
        return mesNascimento;
    }
    /**
     * Define o ano de nascimento da pessoa.
     * 
     * @param anoNascimento O ano de nascimento da pessoa.
     */

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    /**
     * Obtém o ano de nascimento da pessoa.
     * 
     * @return O ano de nascimento da pessoa.
     */

    public int getAnoNascimento() {
        return anoNascimento;
    }
    /**
     * Define a altura da pessoa.
     * 
     * @param altura A altura da pessoa em metros.
     */

    public void setAltura(double altura) {
        this.altura = altura;
    }
    /**
     * Obtém a altura da pessoa.
     * 
     * @return A altura da pessoa em metros.
     */

    public double getAltura() {
        return altura;
    }
    /**
     * Define o peso da pessoa.
     * 
     * @param peso O peso da pessoa em quilogramas.
     */

    public void setPeso(double peso) {
        this.peso = peso;
    }
    /**
     * Obtém o peso da pessoa.
     * 
     * @return O peso da pessoa em quilogramas.
     */

    public double getPeso() {
        return peso;
    }
    /**
     * Calcula a idade da pessoa com base no ano atual.
     * 
     * @param anoAtual O ano atual.
     * @return A idade da pessoa.
     */

    // Método para calcular a idade
    public int calcularIdade(int anoAtual) {
        return anoAtual - this.anoNascimento;
    }
    /**
     * Calcula o Índice de Massa Corporal (IMC) da pessoa.
     * 
     * @return O IMC da pessoa.
     */

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }
    /**
     * Calcula a frequência cardíaca máxima da pessoa.
     * 
     * @return A frequência cardíaca máxima da pessoa.
     */

    // Método para calcular a frequência cardíaca máxima
    public int calcularFrequenciaMaxima() {
        return 220 - calcularIdade(2024);
    }
    /**
     * Calcula a frequência cardíaca alvo da pessoa.
     * 
     * @return A frequência cardíaca alvo da pessoa.
     */


    // Método para calcular a frequência cardíaca alvo
    public String calcularFrequenciaAlvo() {
        int frequenciaMaxima = calcularFrequenciaMaxima();
        double alvoMinimo = 0.5 * frequenciaMaxima; // 50% da frequência máxima
        double alvoMaximo = 0.85 * frequenciaMaxima; // 85% da frequência máxima
        return String.format("%.0f-%.0f", alvoMinimo, alvoMaximo);
    }
}

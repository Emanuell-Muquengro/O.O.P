/**
 * Representa um funcionário da imobiliária no sistema.
 */
public class Funcionario {
    private int codigo;
    private String nome;
    private String agencia;
    private double salarioMensal;

    /**
     * Construtor da classe Funcionario.
     * 
     * @param codigo        O código do funcionário.
     * @param nome          O nome do funcionário.
     * @param agencia       A agência onde o funcionário trabalha.
     * @param salarioMensal O salário mensal do funcionário.
     */
    public Funcionario(int codigo, String nome, String agencia, double salarioMensal) {
        this.codigo = codigo;
        this.nome = nome;
        this.agencia = agencia;
        this.salarioMensal = salarioMensal;
    }

    /**
     * Retorna o código do funcionário.
     * 
     * @return O código do funcionário.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Define o código do funcionário.
     * 
     * @param codigo O novo código do funcionário.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Retorna o nome do funcionário.
     * 
     * @return O nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do funcionário.
     * 
     * @param nome O novo nome do funcionário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a agência onde o funcionário trabalha.
     * 
     * @return A agência do funcionário.
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * Define a agência onde o funcionário trabalha.
     * 
     * @param agencia A nova agência do funcionário.
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * Retorna o salário mensal do funcionário.
     * 
     * @return O salário mensal do funcionário.
     */
    public double getSalarioMensal() {
        return salarioMensal;
    }

    /**
     * Define o salário mensal do funcionário.
     * 
     * @param salarioMensal O novo salário mensal do funcionário.
     */
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
}

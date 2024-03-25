/**
 * Representa um funcionário da empresa de gestão de condomínios.
 */
public class Funcionarios {
    private String nome;
    private String cargo;
    private double salário;

    /**
     * Construtor da classe Funcionário.
     * 
     * @param nome    O nome do funcionário.
     * @param cargo   O cargo do funcionário.
     * @param salário O salário do funcionário.
     */
    public Funcionarios(String nome, String cargo, double salário) {
        this.nome = nome;
        this.cargo = cargo;
        this.salário = salário;
    }

    /**
     * Obtém o nome do funcionário.
     * 
     * @return O nome do funcionário.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do funcionário.
     * 
     * @param nome O nome do funcionário.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o cargo do funcionário.
     * 
     * @return O cargo do funcionário.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Define o cargo do funcionário.
     * 
     * @param cargo O cargo do funcionário.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtém o salário do funcionário.
     * 
     * @return O salário do funcionário.
     */
    public double getSalário() {
        return salário;
    }

    /**
     * Define o salário do funcionário.
     * 
     * @param salário O salário do funcionário.
     */
    public void setSalário(double salário) {
        this.salário = salário;
    }

    public static void remove(Funcionarios funcionário) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}

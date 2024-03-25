/**
 * Representa um edifício gerenciado pela empresa de gestão de condomínios.
 */
public class Edificio {
    private String nome;
    private Condomino[] condominos;
    private Conta[] contas;
    private EmpresaServico[] empresasServiços;
    private int numCondominos;
    private int numContas;
    private int numEmpresasServiços;
    
    // Construtor
    public Edificio(String nome, int capacidadeCondôminos, int capacidadeContas, int capacidadeEmpresasServiços) {
        this.nome = nome;
        this.condominos = new Condomino[capacidadeCondôminos];
        this.contas = new Conta[capacidadeContas];
        this.empresasServiços = new EmpresaServico[capacidadeEmpresasServiços];
        this.numCondominos = 0;
        this.numContas = 0;
        this.numEmpresasServiços = 0;
    }

    /**
     * Obtém o nome do edifício.
     * 
     * @return O nome do edifício.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do edifício.
     * 
     * @param nome O nome do edifício.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém os condôminos do edifício.
     * 
     * @return Os condôminos do edifício.
     */
    public Condomino[] getCondôminos() {
        return condominos;
    }

    /**
     * Define os condôminos do edifício.
     * 
     * @param condôminos Os condôminos do edifício.
     */
    public void setCondôminos(Condomino[] condôminos) {
        this.condominos = condôminos;
    }

    /**
     * Obtém as contas do edifício.
     * 
     * @return As contas do edifício.
     */
    public Conta[] getContas() {
        return contas;
    }

    /**
     * Define as contas do edifício.
     * 
     * @param contas As contas do edifício.
     */
    public void setContas(Conta[] contas) {
        this.contas = contas;
    }

    /**
     * Obtém as empresas de serviços do edifício.
     * 
     * @return As empresas de serviços do edifício.
     */
    public EmpresaServico[] getEmpresasServiços() {
        return empresasServiços;
    }

    /**
     * Define as empresas de serviços do edifício.
     * 
     * @param empresasServiços As empresas de serviços do edifício.
     */
    public void setEmpresasServiços(EmpresaServico[] empresasServiços) {
        this.empresasServiços = empresasServiços;
    }

    /**
     * Obtém o número de condôminos do edifício.
     * 
     * @return O número de condôminos do edifício.
     */
    public int getNumCondominos() {
        return numCondominos;
    }

    /**
     * Define o número de condôminos do edifício.
     * 
     * @param numCondôminos O número de condôminos do edifício.
     */
    public void setNumCondominos(int numCondôminos) {
        this.numCondominos = numCondominos;
    }

    /**
     * Obtém o número de contas do edifício.
     * 
     * @return O número de contas do edifício.
     */
    public int getNumContas() {
        return numContas;
    }

    /**
     * Define o número de contas do edifício.
     * 
     * @param numContas O número de contas do edifício.
     */
    public void setNumContas(int numContas) {
        this.numContas = numContas;
    }

    /**
     * Obtém o número de empresas de serviços do edifício.
     * 
     * @return O número de empresas de serviços do edifício.
     */
    public int getNumEmpresasServiços() {
        return numEmpresasServiços;
    }

    /**
     * Define o número de empresas de serviços do edifício.
     * 
     * @param numEmpresasServiços O número de empresas de serviços do edifício.
     */
    public void setNumEmpresasServiços(int numEmpresasServiços) {
        this.numEmpresasServiços = numEmpresasServiços;
    }
    
}

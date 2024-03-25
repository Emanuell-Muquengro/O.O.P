/**
 * Representa uma empresa prestadora de serviços.
 */
public class EmpresaServico {
    private String nome;
    private String tipoServiço;
    private String contato;

    /**
     * Construtor da classe EmpresaServiços.
     * 
     * @param nome         O nome da empresa.
     * @param tipoServiço  O tipo de serviço prestado pela empresa.
     * @param contato      O contato da empresa.
     */
    public EmpresaServico(String nome, String tipoServiço, String contato) {
        this.nome = nome;
        this.tipoServiço = tipoServiço;
        this.contato = contato;
    }

    /**
     * Obtém o nome da empresa.
     * 
     * @return O nome da empresa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da empresa.
     * 
     * @param nome O nome da empresa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o tipo de serviço prestado pela empresa.
     * 
     * @return O tipo de serviço prestado pela empresa.
     */
    public String getTipoServiço() {
        return tipoServiço;
    }

    /**
     * Define o tipo de serviço prestado pela empresa.
     * 
     * @param tipoServiço O tipo de serviço prestado pela empresa.
     */
    public void setTipoServiço(String tipoServiço) {
        this.tipoServiço = tipoServiço;
    }

    /**
     * Obtém o contato da empresa.
     * 
     * @return O contato da empresa.
     */
    public String getContato() {
        return contato;
    }

    /**
     * Define o contato da empresa.
     * 
     * @param contato O contato da empresa.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }
}

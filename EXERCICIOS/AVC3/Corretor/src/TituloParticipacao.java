/**
 * Classe que representa um Título de Participação em uma firma de investimentos.
 */
public class TituloParticipacao {
    private String designacao;
    private String empresa;
    private String dataEmissao;
    private double valorFacial;
    private double valorAtual;

    /**
     * Construtor da classe TituloParticipacao.
     */
    public TituloParticipacao(String designacao, String empresa, String dataEmissao, double valorFacial, double valorAtual) {
        this.designacao = designacao;
        this.empresa = empresa;
        this.dataEmissao = dataEmissao;
        this.valorFacial = valorFacial;
        this.valorAtual = valorAtual;
    }

    /**
     * Método para atualizar o valor atual do título de participação.
     */
    public void atualizarValorAtual(double novoValor) {
        this.valorAtual = novoValor;
    }

    public void setDesignacao(String designacao){
        this.designacao = designacao;
    }

    public String getDesignacao(){
        return designacao;
    }
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    public String getEmpresa(){
        return empresa;
    }
    public void setDataEmissao(String dataEmissao){
        this.dataEmissao=dataEmissao;
    }

    public String getDataEmissao(){
        return dataEmissao;
    }
    public void setValorFacial(double valorFacial){
        this.valorFacial=valorFacial;
    }

    public double getValorFacial(){
        return valorFacial;
    }
    public void setValorAtual(double valorAtual){
        this.valorAtual=valorAtual;
    }

    public double getValorAtual(){
        return valorAtual;
    }

    /**
     * Método para exibir os detalhes do título de participação.
     */
    public void exibirDetalhes() {
        System.out.println("Designação: " + designacao);
        System.out.println("Empresa: " + empresa);
        System.out.println("Data de Emissão: " + dataEmissao);
        System.out.println("Valor Facial: " + valorFacial);
        System.out.println("Valor Atual: " + valorAtual);
    }

   

    // Outros métodos e implementações podem ser adicionados conforme necessário
}

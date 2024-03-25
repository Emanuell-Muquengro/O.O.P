/**
 * Representa o relatório de contas anual de um edifício.
 */
public class RelatorioConta {
    private Edificio edifício;
    private int ano;
    private double totalDespesas;
    private double totalReceitas;

    // Construtor
    public  RelatorioConta(Edificio edifício, int ano) {
        this.edifício = edifício;
        this.ano = ano;
        this.totalDespesas = 0.0;
        this.totalReceitas = 0.0;
    }

    /**
     * Obtém o edifício associado ao relatório de contas.
     * 
     * @return O edifício associado ao relatório de contas.
     */
    public Edificio getEdifício() {
        return edifício;
    }

    /**
     * Define o edifício associado ao relatório de contas.
     * 
     * @param edifício O edifício associado ao relatório de contas.
     */
    public void setEdifício(Edificio edifício) {
        this.edifício = edifício;
    }

    /**
     * Obtém o ano do relatório de contas.
     * 
     * @return O ano do relatório de contas.
     */
    public int getAno() {
        return ano;
    }

    /**
     * Define o ano do relatório de contas.
     * 
     * @param ano O ano do relatório de contas.
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Obtém o total de despesas do relatório de contas.
     * 
     * @return O total de despesas do relatório de contas.
     */
    public double getTotalDespesas() {
        return totalDespesas;
    }

    /**
     * Define o total de despesas do relatório de contas.
     * 
     * @param totalDespesas O total de despesas do relatório de contas.
     */
    public void setTotalDespesas(double totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    /**
     * Obtém o total de receitas do relatório de contas.
     * 
     * @return O total de receitas do relatório de contas.
     */
    public double getTotalReceitas() {
        return totalReceitas;
    }

    /**
     * Define o total de receitas do relatório de contas.
     * 
     * @param totalReceitas O total de receitas do relatório de contas.
     */
    public void setTotalReceitas(double totalReceitas) {
        this.totalReceitas = totalReceitas;
    }
}

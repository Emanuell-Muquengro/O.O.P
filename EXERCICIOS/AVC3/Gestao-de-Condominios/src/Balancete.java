/**
 * Representa o balancete mensal ou trimestral de um edifício.
 */
public class Balancete {
    private Edificio edifício;
    private String período;
    private double totalDespesas;
    private double totalReceitas;

    // Construtor
    public Balancete(Edificio edifício, String período) {
        this.edifício = edifício;
        this.período = período;
        this.totalDespesas = 0.0;
        this.totalReceitas = 0.0;
    }

    /**
     * Obtém o edifício associado ao balancete.
     * 
     * @return O edifício associado ao balancete.
     */
    public Edificio getEdifício() {
        return edifício;
    }

    /**
     * Define o edifício associado ao balancete.
     * 
     * @param edifício O edifício associado ao balancete.
     */
    public void setEdifício(Edificio edifício) {
        this.edifício = edifício;
    }

    /**
     * Obtém o período do balancete.
     * 
     * @return O período do balancete.
     */
    public String getPeríodo() {
        return período;
    }

    /**
     * Define o período do balancete.
     * 
     * @param período O período do balancete.
     */
    public void setPeríodo(String período) {
        this.período = período;
    }

    /**
     * Obtém o total de despesas do balancete.
     * 
     * @return O total de despesas do balancete.
     */
    public double getTotalDespesas() {
        return totalDespesas;
    }

    /**
     * Define o total de despesas do balancete.
     * 
     * @param totalDespesas O total de despesas do balancete.
     */
    public void setTotalDespesas(double totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    /**
     * Obtém o total de receitas do balancete.
     * 
     * @return O total de receitas do balancete.
     */
    public double getTotalReceitas() {
        return totalReceitas;
    }

    /**
     * Define o total de receitas do balancete.
     * 
     * @param totalReceitas O total de receitas do balancete.
     */
    public void setTotalReceitas(double totalReceitas) {
        this.totalReceitas = totalReceitas;
    }
}

public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;



    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String nome)
    {
        this.nome= nome;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }
    
    public double getValor()
    {
        return this.valor;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public boolean aplicarDesconto(double percentagem){

        if(percentagem > 0.1){
            return false;
        }
        double desconto = getValor() * percentagem;
        setValor(getValor()- desconto);
        return true;
    }
    
    
}

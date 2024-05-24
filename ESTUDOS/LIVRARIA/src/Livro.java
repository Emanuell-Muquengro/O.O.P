public abstract class Livro implements Produto {
    private String nome;
    private String descricao;
    private String isbn;
    private double valor;
    private Autor autor;
    
    
    public Livro(Autor autor){
       
        this.autor = autor;
        this.isbn = "000-0000-00-000";
      
    }
    public Livro(){

    }
    public void setValor(double valor)
    {
        this.valor = valor;
    }
    
    public double getValor()
    {
        return this.valor;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String nome)
    {
        this.nome= nome;
    }
    
    public String getISBN()
    {
        return this.isbn;
    }
    
    public void setISBN(String isbn)
    {
        this.isbn= isbn;
    }
    
   public String getDESCRICAO()
    {
        return this.descricao;
    }
    
    public void setDESCRICAO(String descricao)
    {
        this.descricao= descricao;
    }
    
     public Autor getAutor()
    {
        return this.autor;
    }
    public void setAutor(Autor autor)
    {
        this.autor = autor;
    } 
    
    void mostrarDetalhes(){
        
        System.out.println("MOstrar Detalhes do Livro");
        System.out.println("Nome: " + nome);
        System.out.println("Descricao: " +descricao);
        System.out.println("ISBN: " + isbn);
        System.out.println("Valor: " + valor);
        
         if(this.temAutor())
        {
            autor.mostrarDetalhesAutor();
        }
         System.out.println("--");      
    }
   
    public boolean aplicarDesconto(double percentagem){
        
          return false;      
    }
    boolean temAutor(){
        return this.autor != null;
    }

}

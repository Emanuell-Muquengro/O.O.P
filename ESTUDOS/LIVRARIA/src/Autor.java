public class Autor {
    private String nome;
    private String email;
    private String cpf;
    
    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getCPF()
    {
        return this.cpf;
    }
    public void setCPF(String cpf)
    {
        this.cpf = cpf;
    }
    void mostrarDetalhesAutor(){
        System.out.println("Mostrar Detalhesz do Autor");
        System.out.println("Nome: " +nome);
        System.out.println("Email: "+email);
        System.out.println("CPF: "+cpf);
        
    }
}

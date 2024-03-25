class Pais {
    private String nome;
    private String codigoFifa;

    public Pais(String nome, String codigoFifa) {
        this.nome = nome;
        this.codigoFifa = codigoFifa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFifa() {
        return codigoFifa;
    }

    public void setCodigoFifa(String codigoFifa) {
        this.codigoFifa = codigoFifa;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Código FIFA: " + codigoFifa);
    }
}

import java.util.List;

public class Equipa {
    private String nome;
    private String mascote;
    private List<Socio> membros;

    // Construtor
    public Equipa(String nome, String mascote, List<Socio> membros) {
        this.nome = nome;
        this.mascote = mascote;
        this.membros = membros;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMascote() {
        return mascote;
    }

    public void setMascote(String mascote) {
        this.mascote = mascote;
    }

    public List<Socio> getMembros() {
        return membros;
    }

    public void setMembros(List<Socio> membros) {
        this.membros = membros;
    }

    // Outros métodos relacionados às equipas
}

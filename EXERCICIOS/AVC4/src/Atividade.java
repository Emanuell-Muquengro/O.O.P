import java.util.List;

public class Atividade {
    private String nome;
    private String responsavel;
    private List<EspacoDesportivo> espacos;

    // Construtor
    public Atividade(String nome, String responsavel, List<EspacoDesportivo> espacos) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.espacos = espacos;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public List<EspacoDesportivo> getEspacos() {
        return espacos;
    }

    public void setEspacos(List<EspacoDesportivo> espacos) {
        this.espacos = espacos;
    }

    // Outros métodos relacionados às atividades desportivas
}

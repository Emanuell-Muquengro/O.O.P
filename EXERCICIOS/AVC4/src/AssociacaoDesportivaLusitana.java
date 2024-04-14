import java.util.ArrayList;
import java.util.List;

public class AssociacaoDesportivaLusitana {
    private List<Socio> socios;
    private List<Atividade> atividades;
    private List<EspacoDesportivo> espacos;
    private List<Campeonato> campeonatos;

    // Construtor
    public AssociacaoDesportivaLusitana() {
        this.socios = new ArrayList<>();
        this.atividades = new ArrayList<>();
        this.espacos = new ArrayList<>();
        this.campeonatos = new ArrayList<>();
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public List<EspacoDesportivo> getEspacos() {
        return espacos;
    }
    // Métodos para gerenciar sócios
    public void adicionarSocio(Socio socio) {
        socios.add(socio);
    }

    public void removerSocio(Socio socio) {
        socios.remove(socio);
    }

    // Métodos para gerenciar atividades
    public void adicionarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public void removerAtividade(Atividade atividade) {
        atividades.remove(atividade);
    }

    // Métodos para gerenciar espaços desportivos
    public void adicionarEspacoDesportivo(EspacoDesportivo espaco) {
        espacos.add(espaco);
    }

    public void removerEspacoDesportivo(EspacoDesportivo espaco) {
        espacos.remove(espaco);
    }

    // Métodos para gerenciar campeonatos
    public void adicionarCampeonato(Campeonato campeonato) {
        campeonatos.add(campeonato);
    }

    public void removerCampeonato(Campeonato campeonato) {
        campeonatos.remove(campeonato);
    }

    // Outros métodos relacionados à associação desportiva
}

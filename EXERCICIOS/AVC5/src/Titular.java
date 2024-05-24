import java.util.Objects;

public class Titular {
    private String nome;
    private int numeroCliente;

    public Titular(String nome, int numeroCliente) {
        this.nome = nome;
        this.numeroCliente = numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Titular titular = (Titular) obj;
        return numeroCliente == titular.numeroCliente;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroCliente);
    }



    @Override
    public String toString() {
        return "Titular{" +
                "nome='" + nome + '\'' +
                ", numeroCliente=" + numeroCliente +
                '}';
    }
}

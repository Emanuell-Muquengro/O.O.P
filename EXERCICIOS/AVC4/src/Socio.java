import java.time.LocalDate;

// Interface Socio
public interface Socio {
    // Métodos que todas as classes que representam sócios devem implementar
    String getNome(); // Retorna o nome do sócio
    int getNumeroSocio(); // Retorna o número de sócio do sócio
    LocalDate getDataInscricao(); // Retorna a data de inscrição do sócio
    boolean temQuotasEmDia(); // Verifica se o sócio tem as quotas em dia
}

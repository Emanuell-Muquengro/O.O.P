import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        AssociacaoDesportivaLusitana associacao = new AssociacaoDesportivaLusitana();

        // Criando alguns sócios
        SocioDirigente socioDirigente = new SocioDirigente("Joao", 1, LocalDate.now(), true, 3);
        SocioHonorario socioHonorario = new SocioHonorario("Maria", 2, LocalDate.now(), false);
        SocioOrdinario socioOrdinario = new SocioOrdinario("Pedro", 3, LocalDate.now(), true, null);
        SocioOrdinario socioOrdinario2 = new SocioOrdinario("Ana", 4, LocalDate.now(), true, null);

        Quota quota2024 = new Quota(2024, true, LocalDate.now());

        // Criando uma instância de Recibo para o sócio e a quota de 2024
        Recibo recibo = new Recibo(1, LocalDate.now(), socioOrdinario2, 2024);

        // Adicionando os sócios à associação
        associacao.adicionarSocio(socioDirigente);
        associacao.adicionarSocio(socioHonorario);
        associacao.adicionarSocio(socioOrdinario);

        // Criando algumas atividades
        List<EspacoDesportivo> espacos = new ArrayList<>();
        espacos.add(new EspacoDesportivo("Campo A"));
        espacos.add(new EspacoDesportivo("Piscina B"));

        Atividade futsal = new Atividade("Futsal", "Responsável Futsal", espacos);
        Atividade paintball = new Atividade("Paintball", "Responsável Paintball", espacos);

        // Adicionando as atividades à associação
        associacao.adicionarAtividade(futsal);
        associacao.adicionarAtividade(paintball);

        // Criando alguns espaços desportivos
        EspacoDesportivo campoC = new EspacoDesportivo("Campo C");
        EspacoDesportivo piscinaD = new EspacoDesportivo("Piscina D");

        // Adicionando os espaços desportivos à associação
        associacao.adicionarEspacoDesportivo(campoC);
        associacao.adicionarEspacoDesportivo(piscinaD);

        // Imprimindo informações sobre a associação
        System.out.println("Sócios cadastrados na associação:");
        for (Socio socio : associacao.getSocios()) {
            System.out.println(socio.getNome());
        }

        System.out.println("\nAtividades oferecidas pela associação:");
        for (Atividade atividade : associacao.getAtividades()) {
            System.out.println(atividade.getNome());
        }

        System.out.println("\nEspaços desportivos disponíveis:");
        for (EspacoDesportivo espaco : associacao.getEspacos()) {
            System.out.println(espaco.getDesignacao());
        }

         // Imprimindo informações sobre o recibo
         System.out.println("\nEmitindo dados do recibo");
        
         System.out.println("Numero: " + recibo.getNumero());
         System.out.println("Data de Emissao: " + recibo.getDataEmissao());
         System.out.println("Socio: " + recibo.getSocio().getNome());
         System.out.println("Ano da Quota: " + recibo.getAnoQuota());
    }
}
    


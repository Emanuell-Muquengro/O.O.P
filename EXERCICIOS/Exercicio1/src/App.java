import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /**
 *
 * @author Emanuell
 */

    
         /**
     * Método principal que executa o programa.
     *
     * @param args os argumentos de linha de comando (não utilizados neste programa)
     */
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite o dia de nascimento:");
        int diaNascimento = scanner.nextInt();

        System.out.println("Digite o mês de nascimento:");
        int mesNascimento = scanner.nextInt();

        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        HeartRates pessoa = new HeartRates(nome, sobrenome, diaNascimento, mesNascimento, anoNascimento);

        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Data de Nascimento: " + pessoa.getDiaNascimento() + "/" + pessoa.getMesNascimento() + "/" + pessoa.getAnoNascimento());
        System.out.println("Idade: " + pessoa.calcularIdade(2024) + " anos");
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaMaxima() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + pessoa.calcularFrequenciaAlvo() + " bpm");

        scanner.close();
    }
    }


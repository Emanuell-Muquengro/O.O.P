import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o sobrenome:");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite o sexo (M/F):");
        char sexo = scanner.nextLine().charAt(0);

        System.out.println("Digite o dia de nascimento:");
        int diaNascimento = scanner.nextInt();

        System.out.println("Digite o mês de nascimento:");
        int mesNascimento = scanner.nextInt();

        System.out.println("Digite o ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        System.out.println("Digite a altura (em metros):");
        double altura = scanner.nextDouble();

        System.out.println("Digite o peso (em quilogramas):");
        double peso = scanner.nextDouble();

        HealthProfile pessoa = new HealthProfile(nome, sobrenome, sexo, diaNascimento, mesNascimento, anoNascimento, altura, peso);

        System.out.println("Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Data de Nascimento: " + pessoa.getDiaNascimento() + "/" + pessoa.getMesNascimento() + "/" + pessoa.getAnoNascimento());
        System.out.println("Altura: " + pessoa.getAltura() + " metros");
        System.out.println("Peso: " + pessoa.getPeso() + " quilogramas");
        System.out.println("Idade: " + pessoa.calcularIdade(2024) + " anos");
        System.out.println("IMC: " + pessoa.calcularIMC());
        System.out.println("Frequência Cardíaca Máxima: " + pessoa.calcularFrequenciaMaxima() + " bpm");
        System.out.println("Frequência Cardíaca Alvo: " + pessoa.calcularFrequenciaAlvo() + " bpm");

        scanner.close();
    }
    }


/**
 *
 * @author Emanuell
 */
/**
 * Classe de teste para a classe Livro, que demonstra a utilização do método exibirDuracaoEmHoras().
 */
public class App {
     /**
     * Método principal que cria instâncias da classe Livro e demonstra o uso do método exibirDuracaoEmHoras().
     * @param args Argumentos da linha de comando (não utilizados neste caso).
     */
    public static void main(String[] args) throws Exception {
       // Criando o objeto livro1
       Livro livro1 = new Livro("Os Vingadores", 142);

       // Alterando os atributos do livro1
       livro1.setTitulo("Os Vingadores");
       livro1.setDuracaoEmMinutos(142);

       // Chamando o método para exibir a duração em horas do livro1
       livro1.exibirDuracaoEmHoras();

       // Criando o objeto livro2
       Livro livro2 = new Livro("Hotel Transilvânia", 93);

       // Alterando os atributos do livro2
       livro2.setTitulo("Hotel Transilvânia");
       livro2.setDuracaoEmMinutos(93);

       // Chamando o método para exibir a duração em horas do livro2
       livro2.exibirDuracaoEmHoras();

       // Exibindo a mensagem com os títulos dos livros
       System.out.println("Os filmes em cartaz são " + livro1.getTitulo() + " e " + livro2.getTitulo());
   }
    }


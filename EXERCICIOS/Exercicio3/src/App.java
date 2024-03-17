public class App {
    public static void main(String[] args) throws Exception {
        // Criando um objeto livrofavorito do tipo Livro
        Livro livrofavorito = new Livro();
        
        // Alterando o atributo titulo para “O Pequeno Príncipe”
        livrofavorito.setTitulo("O Pequeno Príncipe");
        
        // Alterando o atributo qtdPaginas para 98
        livrofavorito.setQtdPaginas(98);
        
        // Escrevendo na tela a mensagem: “O livro X possui Y páginas”
        System.out.println("O livro " + livrofavorito.getTitulo() + " possui " + livrofavorito.getQtdPaginas() + " páginas.");
        
        // Alterando a quantidade de paginasLidas para 20
        livrofavorito.setPaginasLidas(20);
        
        // Chamando o método verificarProgresso
        livrofavorito.verificarProgresso();
        
        // Alterando a quantidade de paginasLidas para 50
        livrofavorito.setPaginasLidas(50);
        
        // Chamando o método verificarProgresso
        livrofavorito.verificarProgresso();
        
        // Instanciando outros 10 livros e testando os métodos
        for (int i = 1; i <= 10; i++) {
            Livro livro = new Livro("Livro " + i, 200); // Supondo 200 páginas para cada livro
            livro.setPaginasLidas(i * 20); // Definindo páginas lidas como múltiplos de 20
            livro.verificarProgresso(); // Verificando o progresso de leitura de cada livro
        }
    }
}

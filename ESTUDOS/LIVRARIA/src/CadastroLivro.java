public class CadastroLivro {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome ("Emanuel Muquengro");
        autor.setEmail("muquengroemanuel@gmail.com");
        autor.setCPF("92239.2399.2399.77");

        Livro livro = new Livro();
        livro.setNome("A Sutil Arte De Ligar o F*da-se");
      
        livro.setDESCRICAO("Muito Bom");
        livro.setISBN("$$$$$$$$$$$");

        livro.setAutor(autor);
        
    }
}

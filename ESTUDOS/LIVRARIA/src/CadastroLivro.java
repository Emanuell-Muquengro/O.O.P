public class CadastroLivro {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome ("Emanuel Muquengro");
        autor.setEmail("muquengroemanuel@gmail.com");
        autor.setCPF("92239.2399.2399.77");

        Livro livro = new LivroFisico(autor);
        livro.setNome("A Sutil Arte De Ligar o F*da-se");
        livro.setDESCRICAO("Muito Bom");
        livro.setISBN("199-99-00-99-11");
        livro.setValor(109);
        
        livro.setAutor(autor);
        livro.mostrarDetalhes();

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Use a cabeça HTML");
        ebook.mostrarDetalhes();
        
    }
}

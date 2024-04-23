public class RegrasDeDesconto {
    public static void main(String[] args) {
        
        Autor autor = new Autor();

        autor.setNome("Rodrigo Turri");

        Livro livro = new MiniLivro(autor);
        livro.setValor(39.90);

        if(!livro.aplicarDesconto(0.3))
        {
            System.out.println("Desconto no Livro não pode ser maior do que 30%");
        }
        else{
            System.out.println("Valor do livro com o desconto: " + livro.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);

        if(!ebook.aplicarDesconto(0.15))
        {
            System.out.println("Desconto no Livro não pode ser maior do que 30%");
        }
        else{
            System.out.println("Valor do ebook com o desconto: " + ebook.getValor());
        }
    }

}

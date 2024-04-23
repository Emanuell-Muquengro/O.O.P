public class RegistroDeVenda {
    public static void main(String[] args) {
        
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Developmet");
        ebook.setValor(29.90);

        CarrinhoDeCompra carrinho = new CarrinhoDeCompra();
        carrinho.adiciona(ebook);
        carrinho.adiciona(fisico);

        Livro livro = new LivroFisico(autor);
        livro.setNome("CDI");
        carrinho.adiciona(livro);

        System.out.println("Total " + carrinho.getTotal());
    }

}

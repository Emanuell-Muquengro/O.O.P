public class Ebook extends Livro {

   
    private String walterMark;
    public Ebook(Autor autor)
    {
        super(autor);
    }

    @Override
    public boolean aplicarDesconto(double percentagem)
    {
        if(percentagem > 0.15)
        {
            return false;
        }
        return super.aplicarDesconto(percentagem);
    }

    public void setWaterMark(String waterMark)
    {
        this.walterMark = waterMark;
    }
    public String getWaterMark()
    {
        return walterMark;
    }

   
}

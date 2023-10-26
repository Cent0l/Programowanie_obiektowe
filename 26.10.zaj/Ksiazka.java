public class Ksiazka
{
    public String tytul;
    public String autor;
    public int rokWydania;
    public Ksiazka()
    {
        this.tytul="default";
        this.autor="default";
        this.rokWydania=0;

    }
    public Ksiazka(String tytul,String autor,int rokWydania)
    {
        this.tytul=tytul;
        this.autor=autor;
        this.rokWydania=rokWydania;
    }

}

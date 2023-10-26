public class Osba
{
    public String imie;
    public static int licznik;
    public Osba()
    {
        this("default");
    }
    public Osba(String imie)
    {
        this.imie=imie;
        licznik+=1;
    }
}


public class Produkt
{
    public static int liczbaProduktow;
    public final int MAX_PRODUKTOW=300;
    public Produkt()
    {
        if(liczbaProduktow<MAX_PRODUKTOW)
            liczbaProduktow++;
    }
}

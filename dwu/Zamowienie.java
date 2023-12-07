public class Zamowienie implements Comparable<Zamowienie>
{
    String nazwaProduktu;
    int ilosc;
    double cenaJednostkowa;

    @Override
    public int compareTo(Zamowienie s)
    {
        if (Double.compare(this.cenaJednostkowa, s.cenaJednostkowa) == 0)
            return Integer.compare(this.ilosc, s.ilosc);
        return Double.compare(s.cenaJednostkowa, this.cenaJednostkowa);
    }
}

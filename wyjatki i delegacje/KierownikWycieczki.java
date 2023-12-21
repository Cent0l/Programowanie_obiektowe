public class KierownikWycieczki //delegat
{
    private final Biletomat biletomat;
    public KierownikWycieczki(Biletomat biletomat)
    {
        this.biletomat=biletomat;
    }
    public void ogarnijBilet()
    {
        biletomat.wystawBilet();
    }
}

public class Samochod
{
    private final Silnik silnik;

    public Samochod(Silnik silnik) {
        this.silnik = silnik;
    }
    void start()
    {
        silnik.uruchom();
    }
    void stop()
    {
        silnik.zatrzymaj();
    }
}

public class Uzytkownik
{
    private final Powiadomienie powiadomienie;

    public Uzytkownik(Powiadomienie powiadomienie) {
        this.powiadomienie = powiadomienie;
    }
    public void powiadomOModernizacji(String informacja)
    {
        powiadomienie.wyslij(informacja);
    }
}

public class Email implements Powiadomienie
{

    @Override
    public void wyslij(String wiadomosc) {
        System.out.println("przeslano Email o tresci''"+wiadomosc+"''");
    }
}

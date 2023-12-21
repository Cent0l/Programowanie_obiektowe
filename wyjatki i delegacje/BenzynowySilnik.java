public class BenzynowySilnik implements Silnik
{

    @Override
    public void uruchom() {
        System.out.println("brum brum");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("*cisza*");
    }
}

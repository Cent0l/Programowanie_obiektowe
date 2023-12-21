import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
        Koncert koncert = new Koncert();
        LotMiedzynarodowy lot=new LotMiedzynarodowy();
        BramkaNaAutostradzie bramka = new BramkaNaAutostradzie();
        koncert.wystawBilet();
        lot.wystawBilet();
        bramka.wystawBilet();


        KierownikWycieczki kierownik=new KierownikWycieczki(new Koncert());
        kierownik.ogarnijBilet();
        kierownik=new KierownikWycieczki(new BramkaNaAutostradzie());
        kierownik.ogarnijBilet();
        kierownik=new KierownikWycieczki(new LotMiedzynarodowy());
        kierownik.ogarnijBilet();

         */
        Samochod opel=new Samochod(new BenzynowySilnik());
        opel.start();
        opel.stop();
        System.out.println();
        Uzytkownik uz=new Uzytkownik(new Email());
        uz.powiadomOModernizacji("przykladowa tresc emaila ");
        /*
        System.out.println();
        try
        {
        CheckAgeProgram.checkAge(25);
        CheckAgeProgram.checkAge(15);
        CheckAgeProgram.checkAge(19);
        } catch (IllegalArgumentException e)
        {
            System.err.println("Błąd: " + e.getMessage());
        }

         */
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        boolean end=false;
        while(end==false)
        {
            try
            {
                System.out.println("podaj liczby");
                a=sc.nextInt();
                b=sc.nextInt();
                System.out.println(a/b);
                end=true;
            }
            catch (InputMismatchException e)
            {
                System.out.println("bledny input, sprobuj jeszcze raz. Blad: "+ e);
                sc.nextLine();
            }
            catch (ArithmeticException e)
            {
                System.out.println("bledny input, sprobuj jeszcze raz. Blad:"+ e);
            }
        }
    }
}
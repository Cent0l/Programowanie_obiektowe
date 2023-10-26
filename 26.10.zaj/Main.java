import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
    Ksiazka k1=new Ksiazka("Kon z Valony","Muj Stary",1969);
    Ksiazka k2=new Ksiazka(
            "Wiedzmin, ostatnie zyczenie",
            "Sapkowski",
            1993);//taka forma tez jest git
    Ksiazka k3=new Ksiazka();
        System.out.println(k1.tytul);
        System.out.println(k2.autor);
        System.out.println(k3.rokWydania);

    Samochod s1=new Samochod("Ople","Astra H",2008);
        System.out.println(s1.marka+" "+s1.model+" "+s1.rok_produkcji);



    }
}
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        ArrayList<Osoba>osobalist = new ArrayList<>();
        osobalist.add(new Osoba(156.3,13));
        osobalist.add(new Osoba(171.8,17));
        osobalist.add(new Osoba(171.8,19));
        osobalist.add(new Osoba(180.2,21));
        osobalist.add(new Osoba(169.4,50));

        ArrayList<Osoba>osobaaa = new ArrayList<>();
        osobaaa.add(new Osoba(156.3,13));
        osobaaa.add(new Osoba(171.8,17));
        osobaaa.add(new Osoba(171.8,19));
        osobaaa.add(new Osoba(180.2,21));
        osobaaa.add(new Osoba(169.4,50));
        osobaaa.add(new Osoba(201.3,42));

/*
        //Collections.sort(osobalist, new OsobaHeightComparator());
        osobalist.sort(new OsobaHeightComparator());
        System.out.println(osobalist);
        osobaaa.sort(new OsobaAgeComparator().reversed());
        System.out.println(osobaaa);

        Osoba o1=new Osoba("Stefan",182,21);
        Osoba o2=(Osoba) o1.clone();
        o2.age=31;
        System.out.println(o1+"\n"+o2);
     */

        ArrayList<Samochod>s1=new ArrayList<>();
        s1.add(new Samochod("Opel_Astra",173226,2002));
        s1.add(new Samochod("Opel_Astra",213543,2005));
        s1.add(new Samochod("Opel_Astra",16523,2010));
        s1.add(new Samochod("Opel_Astra",112345,2007));
        System.out.println(s1);
        Collections.sort(s1);
        System.out.println(s1);



    }
}
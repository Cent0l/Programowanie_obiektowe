import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe"); //sout, souf + tab :D
        double liczba1=scanner.nextDouble(); //otrzymywanie dabla;
        System.out.println("podaj druga liczbe");
        double liczba2=scanner.nextDouble();
        System.out.println("dodawanie " +(liczba1+liczba2));
        System.out.println("odejmowanie " +(liczba1-liczba2));
        System.out.println("mnozenie " +(liczba1*liczba2));
        System.out.println("dodawanie " + (liczba1 / liczba2));

        //stringi
        System.out.println("podaj 2 stringi");
        String str1 = scanner.next();
        String str2 = scanner.next();
        System.out.println(str1);
        System.out.println(str2);

        //cztery wymierne
        System.out.println("podaj pierwsza liczbe"); //sout, souf + tab :D
        double a=scanner.nextDouble(); //otrzymywanie dabla;
        System.out.println("podaj druga liczbe");
        double b=scanner.nextDouble();
        System.out.println("podaj trzecia liczbe"); //sout, souf + tab :D
        double c=scanner.nextDouble(); //otrzymywanie dabla;
        System.out.println("podaj czwarta liczbe");
        double d=scanner.nextDouble();
        System.out.println(a+b+c+d);

        //kwadrat
        System.out.println("podaj bok");
        double aa=scanner.nextDouble();
        System.out.println(aa*aa);

     

        //3 liczby i zwraca najwieksza
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();
        int max;
        if (e > f)
        {
            max = e;
        }
        else
        {
            max = f;
        }
        if(max<g)
        {
            max=g;
        }
        System.out.println("max="+ max);

         //dni tyg
        int dzien=scanner.nextInt();
        switch (dzien)
        {
            case 1:
                System.out.println("poniedzialek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("dzien klaty");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piwko :DDD");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("niedziela");
                break;
            default:
                System.out.println("zly dzionek :((");

        }

        System.out.println("Podaj liczbe rok");
        int rok= scanner.nextInt();
        if(rok%4==0 && rok%100!=0){
            System.out.println("Rok przestępny");
        }
        else if (rok%400==0 && rok%4==0) {
            System.out.println("Rok przestępny");
        }
        else{
            System.out.println("Rok nie przestępny");
        }

//Napisz program sprawdzający czy podane liczby z klawiatury mogą stanowić poprawna godzinę w formacie 24-godzinnym.
Przykładowe wejście:
Podaj godzinę: 22
Podaj minuty: 12
Podaj sekundy: 33
Przykładowe wyjście:
Poprawna godzina!
/////////////////
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe godzine");
        int godzina= scanner.nextInt();
        System.out.println("Podaj minute godzine");
        int minuta= scanner.nextInt();
        System.out.println("Podaj sekunde godzine");
        int sekunda= scanner.nextInt();
        if(godzina<24 && minuta<60 && sekunda<60){
            System.out.println("Poprawna godzina!");
        }
        else{
            System.out.println("Błędna godzina :(((");
        }
    }
}

        for(int i=1;i<101;i++)
        {
            System.out.println(i);
        }

        int suma=0;
        int j=0;
        while(j<51)
        {
            suma+=j;
            j++;
        }
        j=0;
        System.out.println(suma);
        suma=0;

        int liczba=2137;
        //we to machnij jako input;
        int temp=0;
        temp=liczba;
        while(temp>0)
        {
            suma=suma+temp%10;
            temp=temp/10;
        }
        System.out.println(suma);
        suma=0;
        }
        

    }
}

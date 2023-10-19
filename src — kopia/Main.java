import java.lang.reflect.Constructor;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        House domStefana = new House();
        domStefana.garage=true;
        domStefana.rooms=6;
        domStefana.area=150;
        domStefana.floors=2;
        domStefana.garden=false;

        House domSylwii = new House();
        domSylwii.garden=true;
        domSylwii.garage=false;
        domSylwii.area=175;
        domSylwii.rooms=4;
        domSylwii.floors=2;

        //House domKlaudii=domSylwii; "zwiazanie ze soba"

        System.out.println(domSylwii.rooms);
        Dog burek=new Dog();
        Dog lapek=new Dog();
        System.out.println(burek.bark());


        Car opelAstraH=new Car();
        opelAstraH.speed=130;
        System.out.println(opelAstraH.speed);
        opelAstraH.decelerate(160);
        System.out.println(opelAstraH.speed);

        Car Audica = new Car();
        //Audica=null;
        System.out.println(Audica.brand);
        //lapek=null;
        System.out.println(lapek.bark());

        Osoba ziomek=new Osoba();
        ziomek.imie="Zgrywus";
        //ziomek.haslo="abc";

        //opelAstraH.blowEngine();






    }
}
//klase tez mozna machnac tu tyle ze bez public;

//Wykonaj kolejno poniższe czynności:
//Stwórz klasę Czlowiek z polem imie. Dodaj do klasy metodę przedstawSie, która wyświetli wiadomość “Cześć, jestem” i imię osoby. W klasie Main, utwórz obiekt Czlowiek i wywołaj na nim metodę przedstawSie. Czy musisz użyć słowo kluczowe this w implementacji metody?
//Dodaj do klasy Czlowiek metodę powiedzCzesc, która jako argument przyjmuje inny obiekt klasy Czlowiek i wyświetla wiadomość “Cześć,” i imię drugiego człowieka. Przeanalizuj działanie.
//Dodaj do klasy Czlowiek metodę zmienImie, która jako argument przyjmuje łańcuch znaków i przypisuje go do pola imie. Utwórz obiekt Czlowiek i użyj metody zmienImie do zmiany jego imienia. Następnie wywołaj metodę przedstawSie. Czy imię zostało zmienione? Czy musisz użyć słowo kluczowe this w implementacji metody?
//Dodaj do klasy Czlowiek metodę zamienImionami, która jako argument przyjmuje inny obiekt klasy Czlowiek i zamienia imionami obie osoby. Utwórz dwa obiekty Czlowiek i użyj metody zamienImionami do zamiany ich imion. Następnie wywołaj metodę przedstawSie na obu obiektach. Czy imiona zostały zamienione?
//[15:01] Marcin Młyński
//Wykonaj kolejno poniższe czynności:
//Stwórz klasę Licznik z jednym polem liczba. Dodaj do klasy metodę zwieksz, która przyjmuje parametr typu int i zwiększa wartość pola liczba o wartość tego parametru. W klasie Main, utwórz zmienną typu int, przekaż ją do metody zwieksz i sprawdź, czy wartość zmiennej zmieniła się po wywołaniu metody.
//Dodaj do klasy Licznik metodę dodaj, która przyjmuje inny obiekt Licznik i dodaje wartość jego pola liczba do pola liczba bieżącego obiektu. Utwórz dwa obiekty Licznik w klasie Main i użyj metody dodaj. Sprawdź, czy obiekt przekazany jako argument metody dodaj zmienił swoją wartość po wywołaniu metody.
//Stwórz klasę Zmieniacz, która posiada metodę zmienWartosc, która jako argument przyjmuje typ int. Wewnątrz metody zmień wartość argumentu na inną. W klasie Main utwórz zmienną int, a następnie przekaż ją do metody zmienWartosc i sprawdź, czy wartość zmiennej się zmieniła.
//Dodaj do klasy Zmieniacz metodę zmienObiekt, która jako argument przyjmuje obiekt Licznik. Wewnątrz metody zmień wartość pola liczba obiektu Licznik na inną. W klasie Main utwórz obiekt Licznik, a następnie przekaż go do metody zmienObiekt i sprawdź, czy wartość pola liczba obiektu się zmieniła.
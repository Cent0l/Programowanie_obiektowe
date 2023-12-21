import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Prośba o wprowadzenie dwóch liczb
                System.out.print("Wprowadź pierwszą liczbę: ");
                int liczba1 = scanner.nextInt();

                System.out.print("Wprowadź drugą liczbę: ");
                int liczba2 = scanner.nextInt();

                // Dzielenie i wyświetlenie wyniku
                int wynik = liczba1 / liczba2;
                System.out.println("Wynik dzielenia: " + wynik);

                // Zakończ pętlę while po udanym dzieleniu
                break;

            } catch (ArithmeticException e) {
                // Obsługa wyjątku ArithmeticException (dzielenie przez zero)
                System.err.println("Błąd: Nie można dzielić przez zero. Spróbuj ponownie.");

            } catch (InputMismatchException e) {
                // Obsługa wyjątku InputMismatchException (wprowadzono coś innego niż liczba)
                System.err.println("Błąd: Wprowadź poprawną liczbę. Spróbuj ponownie.");
                scanner.next(); // Wyczyszczenie bufora wejściowego
            }
        }

        // Zamknięcie skanera
        scanner.close();
    }
}
public class CheckAgeProgram {

    public static void checkAge(int age)
    {
        if (age < 18)
            throw new IllegalArgumentException("Wiek nie może być mniejszy niż 18.");
        else
            System.out.println("Wiek to: " + age);
    }

}
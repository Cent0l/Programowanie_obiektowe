import java.util.Objects;

public class Animal
{
    String name;
    int age;
    double weight;
    public  Animal(String name, int age,double weight)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age
                && Double.compare(weight, animal.weight) == 0
                && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode()
    {
        int result=17;//niezerowa najlepiej liczba pierwsza
        result = 31*result+age;//costam mnozymy najlepiej przez pierwsza
        long doubleToLong = Double.doubleToLongBits(weight);
        //zwraca binarnie na long a nie double
        result =31*result+(int)(doubleToLong^(doubleToLong>>>32));
        //^ to xor, >>> przesuniecie bitowe o 32 pozycje
        result=31*result+name.hashCode();
        return result;

    }
}

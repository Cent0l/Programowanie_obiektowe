public class Vehicle implements Comparable<Vehicle>
{
    String model;
    int speed;

    public int getSpeed() {
        return speed;
    }

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public int compareTo(Vehicle o) {
        return Integer.compare(this.speed,o.speed);
    }
    public static void main(String[] args)
    {
        Vehicle[] samochody={
                new Vehicle("Opel",180),
                new Vehicle("Audi",180),
                new Vehicle("Lamborghini",250)
        };
        System.out.println(maxValue(samochody).getSpeed());
    }
    public static <T extends Comparable<T>> T maxValue(T[] tab)
    {
        if(tab.length==0)
        {
            throw new IllegalArgumentException("Bledne wartosci");
        }
        else
        {
            T max=tab[0];
            for(T i: tab)
            {
                if(i.compareTo(max)>0)
                {
                    max=i;
                }
            }
            return max;
        }
    }
}


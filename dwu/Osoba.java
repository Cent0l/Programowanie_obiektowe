import java.util.Comparator;

public class Osoba implements Comparable<Osoba>,Cloneable
{
    String name;
    double height;
    int age;

    public Osoba(String name, double height, int age)
    {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public Osoba(double height)
    {
        this.height = height;
    }

    public Osoba(int age)
    {
        this.age = age;
    }

    public Osoba(double height, int age)
    {
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return height+" "+age;
    }

    @Override
    public int compareTo(Osoba o)
    {
        if(Double.compare(o.height,this.height)==0)//porownuje, mozna samemu zrobic 3 ify
            return Integer.compare(o.age,this.age);
        return Double.compare(o.height,this.height);


        //return (int) Math.signum(o.height-this.height)
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class OsobaHeightComparator implements Comparator<Osoba>
{
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return Double.compare(o2.height, o1.height);
    }
}
class OsobaAgeComparator implements Comparator<Osoba>
{
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return Integer.compare(o2.age, o1.age);
    }
}
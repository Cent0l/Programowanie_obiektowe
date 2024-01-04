package zad1;

public class Box <T,U>  //<T> daje nam generycznosc, zwykle sie wstawia T
{
    T value;
    U value2;
    public Box(T value,U value2)
    {
        this.value=value;
        this.value2=value2;
    }
}

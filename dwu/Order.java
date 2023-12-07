import java.time.LocalDate;
import java.util.Comparator;

public class Order
{
    int id;
    String customerName;
    LocalDate orderDate;

}
class OrderComare implements Comparator<Order>
{
    @Override
    public int compare(Order o1, Order o2)
    {
        if(o1.orderDate.equals(o2.orderDate))
            return o1.id-o2.id;
        return o1.orderDate.compareTo(o2.orderDate);
    }
}
/*
class OsobaAgeComparator implements Comparator<Osoba>
{
    @Override
    public int compare(Osoba o1, Osoba o2) {
        return Integer.compare(o2.age, o1.age);
    }
}
 */

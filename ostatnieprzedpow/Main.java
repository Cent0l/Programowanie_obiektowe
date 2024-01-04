import zad1.Box;

public class Main
{
    public static void main(String[] args)
    {
        /*
       Box<String,Integer> pudlo=new Box<>("pudlo ",1);
       Box<Integer,Double> pudlo2=new Box<>(15,15.2);
       Box<Double,Double> pudlo3=new Box<>(15.7,21.37);
       String a="xd";
       int b=3;
       String ad="xd";
        System.out.println(isEqal(a,ad));


         */
        Integer[] tab={0,1,2,3,4,5,6,7,8,9,};
        wypisz(tab);
        swap(tab,0,4);
        wypisz(tab);
    }
    public static <T> void wypisz(T value)
    {
        System.out.println(value);
    }
    public static <T> boolean isEqal(T a,T b)
    {
        return a == b;
    }
    public static<T> void wypisz(T[] tab)
    {
        StringBuilder ret= new StringBuilder("[");
        for (T t : tab) {
            ret.append(t);
            ret.append(",");
        }
        ret.append("]");
        System.out.println(ret);
    }
    public static <T> void swap(T[] tab, int ind1,int ind2)
    {
        if(ind1 >= tab.length
                || ind2 >=tab.length
                || ind1<0
                || ind2<0)
        {
            System.out.println("nieprawidlowe indeksy");
        }
        else
        {
            T temp = tab[ind1];
            tab[ind1] = tab[ind2];
            tab[ind2] = temp;
        }
    }
}
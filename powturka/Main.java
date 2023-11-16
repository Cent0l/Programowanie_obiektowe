
import java.util.*;
public class Main
{
    //Napisz statyczną metodę mergeArrays, która przyjmuje dwie tablice liczb całkowitych jako argumenty. Funkcja powinna zwrócić nową listę tablicową, która jest połączeniem obu pierwotnych tablic. Na przykład, dla list tablicowych [1, 2, 3] i [4, 5, 6], funkcja powinna zwrócić [1, 2, 3, 4, 5, 6]. Stwórz przypadek testowy.
    public static void main(String[] args)
    {
    int[] tab1={1,2,3};
    int[] tab2={4,5,6,9};
        System.out.println(mergeArrays(tab1,tab2));

    }
    public static ArrayList<Integer> mergeArrays(int[] tab1,int[] tab2)
    {
        ArrayList<Integer>ret=new ArrayList<Integer>();
        for(int i=0;i<tab1.length;i++)
        {
          ret.add(tab1[i]);
        }
        for(int i=0;i<tab2.length;i++)
        {
            ret.add(tab2[i]);
        }
        return ret;

    }
}



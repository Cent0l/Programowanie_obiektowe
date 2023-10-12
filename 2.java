import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
//import java.util.*; importuje wszystko

public class Main
{
    public static Random random=new Random(); //"wyrzucamy przed nawias"

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //System.out.println(random.nextInt(10,15));  //granica, origin<=random<bound
        System.out.println(generateRandomInt());//odwolujemy sie do funkcji nizej
        System.out.println(generateRandomDouble());
        System.out.println(generateRandomGaussian());
        System.out.println(generateRandomBoolean());
        //int[] tab={0,2,3};
        //System.out.println(Arrays.stream(tab).min().getAsInt()); //do tablic dobre
        //Collection
        ReverseTab();
        System.out.println(TabAvg());
        //Piramida()
        MinMax();
        DelRep();


    }
    public static int generateRandomInt()
    {
        //Random random=new Random();
        return random.nextInt(0,15);
    }
    public static double generateRandomDouble()
    {
        return random.nextDouble(0.0,0.1); // random jest publiczny w klasie main
    }
    public static double generateRandomGaussian()
    {
        return random.nextGaussian();
    }
    public static boolean generateRandomBoolean()
    {
        return random.nextBoolean();
    }
    public static void ReverseTab()
    {
        int[] tab={1,2,3,4,5,6,7,8,9,10};
        System.out.println();
        for (int i=9;i>0;i--)
        {
            System.out.print(tab[i]);
            System.out.print("\t");
        }
        System.out.println();
    }

    public static double TabAvg()
    {
        double[] tab=new double[20];
        for (int i=0;i<20;i++)
        {
            tab[i]=random.nextInt(1,100);
        }
        return Arrays.stream(tab).average().getAsDouble();
    }
    public static void MinMax()
    {
        int[] tab=new int[15];
        for (int i=0;i<15;i++)
        {
            tab[i]=random.nextInt(1,100);
        }
        System.out.println(Arrays.stream(tab).min().getAsInt());
        System.out.println(Arrays.stream(tab).max().getAsInt());

    }
    public static void Piramida()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj znak");
        String znak=scanner.next();
        System.out.println("Podaj wysokosc");
        int wysokosc=scanner.nextInt();

        for (int i=0;i<wysokosc;i++)
        {
            int liczbaspacji=wysokosc-i-1;
            int liczbaznakow=2*i+1;
            StringBuilder sb= new StringBuilder();
            while(liczbaspacji-->0)
            {
                sb.append(' ');
            }
            while(liczbaznakow-->0)
            {
                sb.append(znak);
            }
            System.out.println(sb.toString());
        }
    }

    public static void DelRep(){
        String napis = "banannowy";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<napis.length();i++)
        {
            char currentChar = napis.charAt(i);
            if(sb.indexOf(String.valueOf(currentChar))==-1)
            {
                sb.append(currentChar);
            }
        }
        System.out.println(sb.toString());
    }
    public static void reverseString()
    {
        System.out.println("Podaj słowo: ");
        Scanner scanner = new Scanner(System.in);
        String slowo = scanner.next();
        StringBuilder sb=new StringBuilder();
        sb.append(slowo);
        sb.reverse();
        System.out.println(sb.toString());
    }
    public static void lista()
    {
        ArrayList<Integer> liczby = new ArrayList<>();
        for(int i=0;i<15;i++){
            liczby.add(random.nextInt(0,50));
        }
        System.out.println(liczby);
        for(int j=14;j>=0;j--){
            System.out.println(liczby.get(j));
        }
    }
    //Napisz program, który tworzy listę tablicową 10 liczb zmiennoprzecinkowych, a następnie oblicza i wyświetla ich sumę.
    public static void lista10(){
        ArrayList<Integer> liczby = new ArrayList<>();
    }
}

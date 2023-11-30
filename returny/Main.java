public class Main
{
    public static void main(String[] args)
    {
    Animal zwierz = new Animal("Zeberson",19,21.37);
    Animal zwierz2 = new Animal("Zeberson",18,21.37);

        System.out.println(Integer.toHexString(zwierz.hashCode()));
        System.out.println(Integer.toHexString(zwierz2.hashCode()));

        Person ziomal=new Person("Zbigniew",-54);
        Person ziomal2=new Person("Tytus Szyluk",31);
        System.out.println(ziomal);
        System.out.println(ziomal.equals(ziomal2));
        ziomal2.dziendobry();


        Address GS=new Address("Grove",3,"10-692","Los Santos");
        Person2 CJ =new Person2("Carl","Johnson",GS);
        System.out.println(CJ);
        MusicTrack z1=new MusicTrack("Michael Jordan","Thriller");
        System.out.println(z1);
        Car opel=new Car("opel","astra",10);
        System.out.println(opel.fuelCost(3.06,320));


    }
}
public class TestVehicle
{
    public static void main(String[] args)
    {
        Car Opel=new Car();
        Motorcycle Kawasaki = new Motorcycle();
        System.out.println(Opel.startEngine()+" "+Opel.getFuelLevel());
        System.out.println(Kawasaki.startEngine()+" "+Kawasaki.getFuelLevel());
    }
}

public class Vehicle2
{
    public void drive()
    {
        System.out.println("The vehicle is moving fast bro");
    }
}
class Car2 extends Vehicle2
{
    @Override
    public void drive()
    {
        super.drive();
        System.out.println("szybki wuz dupe wiuz");
    }
}

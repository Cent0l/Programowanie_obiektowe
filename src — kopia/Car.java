public class Car
{
    public String brand;
    public String model;
    public int speed;
    public void accelerate(int value)
    {
        this.speed+=value;
    }
    public void decelerate(int value)
    {
        this.speed-=value;
        if(value>this.speed)
            this.speed=0;
    }
    private void blowEngine()
    {
        this.speed=0;
    }
}

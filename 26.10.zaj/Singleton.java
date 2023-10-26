public class Singleton
{
    private Singleton()
    {

    }
    public static Singleton()
    {
        return Singleton();
    }

}

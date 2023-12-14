public class Radio implements MusicPlayer
{
@Override
    public void turnOn()
    {
        System.out.println("radio wlaczone");
    }
    @Override
    public void turnOf()
    {
        System.out.println("radio wylaczone");
    }
    @Override
    public void nextTrack()
    {
        System.out.println("zmieniono stacje radiowa");
    }

}

public class AudioPlayer implements MediaPlayer
{

    @Override
    public void play(String trackName)
    {
        System.out.println("Teraz Gramy "+trackName);
    }

    @Override
    public void pause()
    {
        System.out.println("Pauza");
    }

    @Override
    public String getCurrentTrack()
    {
        return "Teraz gra dobra nuta";
    }
}

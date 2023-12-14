public class VideoPlayer implements MediaPlayer {

    @Override
    public void play(String trackName) {
        System.out.println("Teraz leci film"+trackName);
    }

    @Override
    public void pause() {
        System.out.println("Pauza");
    }

    @Override
    public String getCurrentTrack() {
        return "Teraz leci dobry film";
    }
}

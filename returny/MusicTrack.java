public record MusicTrack(String title,String author,int timeInSec) {
    public MusicTrack(String author,String title)
    {
        this(author,title,180);
    }
}

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    public void play(String fileName) {
        if (advancedMediaPlayer instanceof VlcPlayer) {
            advancedMediaPlayer.playVlc(fileName);
        } else if (advancedMediaPlayer instanceof Mp4Player) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}

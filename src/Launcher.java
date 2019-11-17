import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class Launcher {
    public static void main(String[] args){

       Game game = new Game("def", 1280, 700);
       game.waiting();

    }
}

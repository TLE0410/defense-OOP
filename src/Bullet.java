import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.io.IOException;

public abstract class Bullet {
    protected double x, y;
    protected int dame, scope, time;
    protected double slowDown, largeDame, speed;
    protected boolean armour;

    protected boolean isReady;

    //sound

    public Bullet (int x, int y) {
        this.x = x;
        this.y = y;
        isReady = false;
    }
    public abstract void choose(Enemy e);
    public abstract void tick ();
    public abstract void render (Graphics g);
    public abstract void reset();

    protected void shootSound () {
        try {
            audio shoot = new audio("music/sfx/player-shoot.wav");
            shoot.play();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}

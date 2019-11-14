import java.awt.*;

public abstract class Bullet {
    protected int x, y;
    protected int dame, speed, scope, time;

    public Bullet (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void choose(Enemy e);
    public abstract void tick ();
    public abstract void render (Graphics g);
    public abstract void reset();
}

import java.awt.*;

public abstract class Bullet {
    protected double x, y;
    protected int dame, scope, time;
    protected double slowDown, largeDame, speed;

    protected boolean isReady;

    public Bullet (int x, int y) {
        this.x = x;
        this.y = y;
        isReady = false;
    }
    public abstract void choose(Enemy e);
    public abstract void tick ();
    public abstract void render (Graphics g);
    public abstract void reset();
}

import java.awt.*;

public abstract class Bullet {
    protected int x, y;
    protected int dame, speed, scope;

    public Bullet (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void tick (Enemy target);
    public abstract void render (Graphics g);
    public abstract void rest();
}

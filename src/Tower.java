import java.awt.*;

public abstract class Tower {
    protected int x, y;
    protected int scope;
    protected Bullet bullet;
    protected boolean renBullet;

    public Tower (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void tick ();
    public abstract void render (Graphics g);
}

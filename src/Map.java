import java.awt.*;
import java.util.HashMap;

public abstract class Map {

    int valid;
    protected int turn;

    protected int firstLand;

    protected double delta = 0;
    protected double now;
    protected double lastTime;
    protected int[] numberEnemy;


    protected int rest;
    public Map () {

        valid = 0;
    }

    public abstract boolean check (double a, double b);
    public abstract boolean left (double x, double y);
    public abstract boolean right (double x, double y);
    public abstract boolean up (double x, double y);
    public abstract boolean down (double x, double y);
    public abstract boolean isTarget (Enemy e);
    public abstract boolean isLandTower (int x, int y);

    public abstract void tick ();
    public abstract void render (Graphics g);
}

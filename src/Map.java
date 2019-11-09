import java.util.HashMap;

public abstract class Map {

    int valid;
    public Map () {
        valid = 0;
    }

    public abstract boolean check (int a, int b);
    public abstract boolean left (int x, int y);
    public abstract boolean right (int x, int y);
    public abstract boolean up (int x, int y);
    public abstract boolean down (int x, int y);
    public abstract boolean isTarget (Enemy e);

    public abstract void render ();
}

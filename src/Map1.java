import java.awt.*;

public class Map1 extends Map {
    int[] maxY = {100,330,620};
    int[] minY = {0,240,560};
    int maxX = 900, minX = -100;

    public Map1() {
        firstLand = 40;
    }

    @Override
    public boolean check(double x, double y) {

        if (x <= maxX && x >= minX) {
            for (int i = 0; i < 3; ++i) {
                if (y >= minY[i] && y <= maxY[i]) {
                    return true;
                }
            }
            return false;
        } else return false;

    }

    @Override
    public boolean left(double x, double y) {
        if ((y >= minY[0] && y <= maxY[0]) ||(y >= minY[2] && y <= maxY[2]))
            return true;
        return false;
    }

    @Override
    public boolean right(double x, double y) {
        if (y >= minY[1] && y <= maxY[1])
            return true;
        return false;
    }

    @Override
    public boolean up(double x, double y) {
        return false;
    }

    @Override
    public boolean down(double x, double y) {

        if ((y <= maxY[1] && x >= maxX && x >= maxX - 50) || (y <= maxY[2] && y >= minY[1] && x <= 100)) {
          //  System.out.println("down am calling");
            return true;
        }
        else
            return false;

    }

    @Override
    public boolean isTarget(Enemy e) {
        if (e.y > minY[2] && e.x >= maxX - 10) {
            //System.out.println("in target");
            return true;
        }
        else return false;
    }

    @Override
    public boolean isLandTower(int x, int y) {
        return false;
    }

    @Override
    public void tick() {

    }


    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.bg,0,0,null);
    }
}

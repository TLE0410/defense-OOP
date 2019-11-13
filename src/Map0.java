import java.awt.*;

public class Map0 extends Map {
    int[] maxY = {160,477,695};
    int[] minY = {45,350,612};
    int maxX = 900, minX = -100;


    public Map0() {
        firstLand = 50;
        turn = 3;
        delta = 0;
        lastTime = System.currentTimeMillis();

        rest = 8;
        numberEnemy = new int[turn];
        numberEnemy[0] = 1;
        numberEnemy[1] = 2;
        numberEnemy[2] = 3;
    }

    @Override
    public boolean check(int x, int y) {
        if (x >= 104 && x <= 860) {
            for (int i = 0; i < 3; ++i) {
                if (y >= minY[i] && y <= maxY[i])
                    return true;
            }
        }
        if (x > 0 && x < 104) {
            if ((y >= minY[0] && y <= maxY[0]) || (y > minY[1] && y < maxY[2]))
                return true;
        }
        if (x > 860 && x <= 1000) {
            if ((y > minY[0] && y < maxY[2]) || (y > minY[2] && y <= 700))
                return true;
        }

        return false;
    }



    @Override
    public boolean left(int x, int y) {
        if ((y >= minY[0] && y <= maxY[0]) ||(y >= minY[2] && y <= maxY[2]))
            return true;
        return false;
    }

    @Override
    public boolean right(int x, int y) {
        if (y >= minY[1] && y <= maxY[1])
            return true;
        return false;
    }

    @Override
    public boolean up(int x, int y) {
        return false;
    }

    @Override
    public boolean down(int x, int y) {

        if ((y <= minY[1] + 20 && x >= 860) || (y <= minY[2] +20 && y >= minY[1] && x <= 100)) {

            return true;
        }
        else
            return false;

    }

    @Override
    public boolean isTarget(Enemy e) {
        if (e.y > minY[2] && e.x >= maxX - 10) {
            System.out.println("in target");
            return true;
        }
        else return false;
    }

    @Override
    public boolean isLandTower(int x, int y) {

        if (x > 0 && x < 860) {
            if (y >= maxY[0] && y <= minY[1])
                return true;
        }
        if (x > 100 && x < 1000) {
            if (y > maxY[1] && y < minY[2])
                return true;
        }
        return false;
    }

    @Override
    public void tick() {
        now = System.currentTimeMillis();
        delta += (now - lastTime)/1000;
        lastTime = now;
       // System.out.println(delta);
    }


    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.bg0,0,0,null);
    }
}

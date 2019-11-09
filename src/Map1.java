
public class Map1 extends Map {
    int[] maxY = {100,330,620};
    int[] minY = {0,240,560};
    int maxX = 900, minX = -100;

    public Map1() {

    }

    @Override
    public boolean check(int x, int y) {
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

        if ((y <= maxY[1] && x >= maxX && x >= maxX - 50) || (y <= maxY[2] && y >= minY[1] && x <= 100)) {
            System.out.println("down am calling");
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
    public void render() {

    }
}

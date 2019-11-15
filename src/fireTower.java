import java.awt.*;

public class fireTower extends Tower {
    private int act = 0;
    private int time = 20;
    public fireTower(int x, int y) {
        super(x, y);
        this.bullet = new fireBullet(x, y);
        super.scope = 100;
    }


    @Override
    public void render(Graphics g) {
        time--;
        if (time < 0) {
            act ++;
            time = 20;
        }
        if (act > 3)
            act = 0;
        g.drawImage(Assets.resize(Assets.fireTower.get(act), 120, 140), x, y, null);
    }
}

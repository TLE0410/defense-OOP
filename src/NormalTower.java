import java.awt.*;

public class NormalTower extends Tower {
    private int act = 0;
    private int time = 20;
    public NormalTower(int x, int y) {
        super(x, y);
        this.bullet = new NormalBullet(x, y);
        super.scope = 150;
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
        if (fight)
            g.drawImage(Assets.resize(Assets.normalTower.get(act), 80, 100), x, y, null);
        else
            g.drawImage(Assets.resize(Assets.normalTower.get(2), 80, 100), x, y, null);
    }
}

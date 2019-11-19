import java.awt.*;

public class landTower extends Tower {
    private int act = 0;
    private int time = 20;
    public landTower(int x, int y) {
        super(x, y);
        this.bullet = new landBullet(x, y);
        super.scope = 140;
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
            g.drawImage(Assets.resize(Assets.landTower.get(act), 120, 140), x, y, null);
        else
            g.drawImage(Assets.resize(Assets.landTower.get(3), 120, 140), x, y, null);
    }
}

import java.awt.*;

public class NormalTower extends Tower {

    public NormalTower(int x, int y) {
        super(x, y);
        super.bullet = new NormalBullet(x, y);
        super.scope = 200;
        renBullet = false;
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.t1, x, y, null);
        if (renBullet) {
            bullet.render(g);
        } else {
            bullet.rest();
        }
    }
}

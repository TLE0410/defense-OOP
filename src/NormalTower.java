import java.awt.*;

public class NormalTower extends Tower {

    public NormalTower(int x, int y) {
        super(x, y);
        this.bullet = new NormalBullet(x, y);
        super.scope = 100;
    }


    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.t1, x, y, null);
    }
}

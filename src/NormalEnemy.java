import java.awt.*;

public class NormalEnemy extends Enemy {

    public NormalEnemy (int x, int y) {
        super(x, y);
        health = 50;
        speed = 1;
        armor = 20;
    }

    @Override
    public void tick() {
        act++;
        if (act >= 19)
            act = 0;
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.resize(Assets.blood,5, health), x - health/10, y - 15, null);
        if (isAhead)
            g.drawImage(Assets.normalEnermy.get(act), x, y, null);
        else {
            System.out.println("flip is calling");
            g.drawImage(Assets.resize(Assets.normalEnemyF.get(act),Assets.eHeight, Assets.eWidth), x, y, null);
        }
    }

}

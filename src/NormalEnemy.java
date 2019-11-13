import java.awt.*;

public class NormalEnemy extends Enemy {

    public NormalEnemy (int x, int y) {
        super(x, y);
        health = 50;
        speed = 1;
        armor = 20;
        isAhead = true;
    }

    @Override
    public void tick() {
        //valid coordinate of enemy
        valid();

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
           // System.out.println("flip is calling");
            g.drawImage(Assets.resize(Assets.normalEnemyF.get(act),Assets.eHeight, Assets.eWidth), x, y, null);
        }
    }

    public void valid () {
        if (x > 975 )
            x = 975;
        if (y > 685)
            y = 685;
        if ( y < 45)
            y = 45;
        if (x < 0)
            x += speed;
    }

}

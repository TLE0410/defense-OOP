import java.awt.*;

public class Boss extends Enemy{

    public Boss (int x, int y) {
        super(x, y);
        health = 150;
        speed = 1;
        armor = 50;
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
        g.drawImage(Assets.resize(Assets.blood,7, health), (int)x - health/10, (int)y - 15, null);
        if (isAhead)
            g.drawImage(Assets.resize(Assets.boss.get(act),Assets.eHeight*2, Assets.eWidth*2), (int)x, (int)y, null);
        else {
            // System.out.println("flip is calling");
            g.drawImage(Assets.resize(Assets.bossF.get(act),Assets.eHeight*2, Assets.eWidth*2), (int)x, (int)y, null);
        }
    }

    public void valid () {
        if (x > 975 )
            x = 975;
        if (y > 655)
            y = 685;
        if ( y < 45)
            y = 45;
        if (x < 0)
            x += speed;
    }


}

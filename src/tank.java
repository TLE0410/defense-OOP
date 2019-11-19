import java.awt.*;

public class tank extends Enemy{

    public tank (int x, int y) {
        super(x, y);
        health = 100;
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
        g.drawImage(Assets.resize(Assets.blood,5, health), (int)x - health/10, (int)y - 15, null);
        if (isAhead)
            g.drawImage(Assets.tanker.get(act), (int)x, (int)y, null);
        else {
            // System.out.println("flip is calling");
            g.drawImage(Assets.resize(Assets.tankerF.get(act),Assets.eHeight, Assets.eWidth), (int)x, (int)y, null);
        }
    }

    public void valid () {
        if (x > 975 )
            x = 975;
        if (y > 675)
            y = 675;
        if ( y < 45)
            y = 45;
        if (x < 0)
            x += speed;
    }

}

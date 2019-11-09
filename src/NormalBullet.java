import java.awt.*;

public class NormalBullet extends Bullet {
    private final int initX, initY;
    private int timeHit;
    private boolean isReady;
    Enemy target;

    public NormalBullet(int x, int y) {
        super(x, y);
        initX = x;
        initY = y;
        timeHit = 0;
        isReady = true;

        super.dame = 10;
        super.speed = 1;
        super.scope = 5;
    }

    @Override
    public void tick(Enemy t) {
        if (x == initX && y == initY)
            isReady = true;
        else
            isReady = false;
        if (isReady)
            target = t;
        if (timeHit <= 0 && target != null) {
            boolean pX = x < target.x;
            boolean pY = y < target.y;
            int speedX = speed + Math.abs(target.x - x)/40;
            int speedY = speed + Math.abs(target.y - y)/40;
            System.out.println(speedX +" " + speedY);

            if (pX) x += speedX;
            else x -= speedX;

            if (pY) y += speedY;
            else y -= speedY;

            if (pX && x > target.x)
                x = target.x;
            if (!pX && x < target.x)
                x = target.x;
            if (pY && y > target.y)
                y = target.y;
            if (!pY && y < target.y)
                y = target.y;
        } else {
            timeHit--;
        }
        if (x == target.x && y == target.y) {
            x = initX;
            y = initY;
            timeHit = speed*15;
        }
    }

    @Override
    public void render(Graphics g) {
        if (timeHit <= 0) {
            g.drawImage(Assets.bullet, x, y, null);
        }
    }

    public void rest () {
        x = initX;
        y = initY;
    }
}

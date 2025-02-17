import java.awt.*;

public class NormalBullet extends Bullet {
    private final double initX, initY;
    private int timeHit;
    private boolean isBreak;
    Enemy target;

    private double eX, eY;

    private double bX, bY;
    private int act, timeBreak;

    public NormalBullet(int x, int y) {
        super(x, y);
        initX = x + 30;
        initY = y;
        timeHit = 0;
        isReady = true;
        isBreak = false;
        eX = 0;
        eY = 0;
        time = 80;
        timeBreak = 10;

        super.dame = 12;
        super.speed = 1;
        super.scope = 5;
        armour = true;
        act = 1;

        slowDown = 0;
        largeDame = 0;
    }

    @Override
    public void choose(Enemy e) {
        if (e == null) {
            eX = 0;
            eY = 0;
        }

        if (x == initX && y == initY)
            isReady = true;
        else
            isReady = false;
        if (isReady) {
           // System.out.println("i am ready " + e.x +" " + e.y);

            target = e;
        }
    }

    @Override
    public void tick() {
        //System.out.println("time hit " + timeHit);
        //System.out.println(eX+" "+eY);
        if (target != null) {
            if (x - eX > 0)
                eX = target.x ;
            else
                eX = target.x;
            eY = target.y;
        } else {
            //System.out.println("no target");
        }
       // double dis = Math.sqrt((x-eX)*(x-eY) + (y - eY)*(y - eY));
        if (timeHit <= 0 && eY !=0 && eX!= 0) {
            if (x == initX && y == initY)
                shootSound();
            //System.out.println("shooting");
            boolean pX = x < eX;
            boolean pY = y < eY;

            double speedX = speed ;
            double speedY = speed ;
            if (eX - x > eY - y)
                eY += 1;
            else eX += 2;

            if (pX) this.x += speedX ;
            else this.x -= speedX ;

            if (pY) this.y += speedY;
            else this.y -= speedY;

            if (pX && this.x > eX)
                this.x = eX;
            if (!pX && x < eX)
                this.x = eX;
            if (pY && y > eY)
                this.y = eY;
            if (!pY && y < eY)
                this.y = eY;

        } else {
            reset();
            timeHit--;
        }

        // check if bullet into enemy or bullet out bound
        if (x == eX && y == eY || Math.sqrt((x-initX)*(x-initX) + (y - initY)*(y - initY)) >= 150){
            isBreak = true;
            bX = eX;
            bY = eY;
            this.x = initX;
            this.y = initY;

            timeHit = time;
        }
    }

    @Override
    public void render(Graphics g) {

        if (timeHit <= 0 && x != initX && y != initY)
            g.drawImage(Assets.normalBullet.get(0),(int) x,(int) y, null);
       if (isBreak ) {

            g.drawImage(Assets.normalBullet.get(act),(int) bX ,(int) bY ,null);

            if (act == 3) {
                isBreak = false;
                act = 1;
            }

            if (timeBreak <= 0) {
                act++;
                timeBreak = 10;
            }
            else {
                timeBreak--;
            }
        }
    }

    public void reset () {
        x = initX;
        y = initY;
    }
}

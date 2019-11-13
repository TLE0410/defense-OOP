import java.awt.*;

public class NormalBullet extends Bullet {
    private final int initX, initY;
    private int timeHit;
    private boolean isReady, isRender;
    Enemy target;

    private int eX, eY;

    public NormalBullet(int x, int y) {
        super(x, y);
        initX = x;
        initY = y;
        timeHit = 0;
        isReady = true;
        isRender = true;
        eX = 0;
        eY = 0;

        super.dame = 20;
        super.speed = 3;
        super.scope = 5;
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
            System.out.println("i am ready " + e.x +" " + e.y);
            target = e;
        }
    }

    @Override
    public void tick() {


        //System.out.println(eX+" "+eY);
        if (target != null) {
            eX = target.x;
            eY = target.y;
        } else {
            System.out.println("no target");
        }
       // double dis = Math.sqrt((x-eX)*(x-eY) + (y - eY)*(y - eY));
        if (timeHit <= 0 && eY !=0 && eX!= 0) {
            System.out.println("shooting");
            boolean pX = x < eX;
            boolean pY = y < eY;

            int speedX = speed ;
            int speedY = speed ;

            if (pX) this.x += speedX ;
            else this.x -= speedX ;

            if (pY) this.y += speedY;
            else this.y -= speedY;

            if (pX && this.x > eX)
                this.x = eX;
            if (!pX && x < eY)
                this.x = eX;
            if (pY && y > eY)
                this.y = eY;
            if (!pY && y < eY)
                this.y = eY;///x y > scope reset
        } else {
            reset();
            timeHit--;
        }

        // check if bullet into enemy
        if (x == eX && y == eY || Math.sqrt((x-eX)*(x-eX) + (y - eY)*(y - eY)) > 200){
           this.x = initX;
           this.y = initY;
            timeHit = 50;
        }
    }

    @Override
    public void render(Graphics g) {
        if (timeHit <= 0 && x != initX && y != initY)
            g.drawImage(Assets.bullet, x, y, null);

    }

    public void reset () {
        x = initX;
        y = initY;
    }
}

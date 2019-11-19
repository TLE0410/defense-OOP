import java.awt.*;

public abstract class Enemy {
    protected int health;
    protected double speed;
    protected int armor;
    protected double x, y;
    protected boolean isAhead, isStraight;
    protected int act;

    public Enemy (int x, int y) {
        this.x = x;
        this.y = y;
        act = 0;
        health = 0;
        speed = 0;
        armor = 0;

        isStraight = true;
    }

    public abstract void tick ();
    public abstract void render (Graphics g);

    public void setHealth (int health) {
        this.health = health;
    }
    public int getHealth () {
        return health;
    }
    public void setSpeed (double speed) {
        this.speed = speed;
    }
    public double getSpeed () {
        return speed;
    }
    public void setArmor (int armor) {
        this.armor = armor;
    }
    public int getArmor () {
        return armor;
    }
    public void left () {
        x += this.speed;
        y += Math.random()*(1 +1);
        y -= 1;
        //System.out.println(y);
        isAhead = true;
    }
    public void right () {
        x -= this.speed;
        y += Math.random()*(1+1);
        y -= 1;
        isAhead = false;
    }
    public void down () {
       // System.out.println("go down");
        y += this.speed;
        x += Math.random()*(1+1);
        x -=1;
    }
    public void up () {
        y -= this.speed;
        x += Math.random()*2;
        x-=1;
    }

}

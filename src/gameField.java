import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class gameField {

    private List<Enemy> enemys;
    private List<Tower> towers;
    private Queue<Map> maps;
    private Map map;
    private int head,gold;
    private int numberEnemy;
    private Game game;

    private static boolean isDragging;
    private int sPX, sPY;
    boolean win = false;

    private int act = 0;

    public gameField (Game game) {
        isDragging = false;
        this.game = game;
        head = 10;
        gold = 9999;

        numberEnemy = 5;

        //constructor map
        maps = new LinkedList<>();

        //constructor enemy
        enemys = new ArrayList<>();
        for (int i = 0; i < numberEnemy; ++i) {
            //after x time 1 enemy appear
            int ran = (int) Math.random()*(100 - 10 +1) + 1;

            enemys.add(new NormalEnemy( - i*30, 50+ ran*i));
        }
        //constructor tower and bullet
        towers = new ArrayList<>();
        addMap();
        map = maps.poll();
    }


    public void addMap() {
        maps.add(new Map0());
    }

    public void tick() {
        try {
            for (Enemy e : enemys) {
                e.tick();
                if (e.health == 0) {
                    enemys.remove(e);
                    gold += 5;
                    continue;
                }


                // check enemy is run able

                if (map.check(e.x, e.y)) {
                    if (map.left(e.x , e.y)) {
                        e.left();
                       // System.out.println("left");
                    }
                    if (map.right(e.x, e.y)) {
                        e.right();
                        //System.out.println("right");
                    }
                    if (map.up(e.x, e.y)) {
                        e.up();
                        //System.out.println("up");
                    }
                    if (map.down(e.x, e.y)) {
                        e.down();
                       // System.out.println("down");
                    }
                    //check if enemy arrived target
                    if (map.isTarget(e)) {
                        enemys.remove(e);
                        head--;
                    }

                } else {
                    if (map.isTarget(e)) {
                        enemys.remove(e);
                        head--;
                    }
                    if (e.x <= 0) {
                        //System.out.println("x out bound right side");
                        e.x += e.speed;
                    } else if (e.x >= 900) {
                        e.x -= e.speed;
                        //System.out.println(" x out bound left side");
                       // System.out.println(e.x);
                    } else if (map.check(e.x, e.y + (int) e.speed)) {
                       // System.out.println("y can't be reach");
                        e.y += e.speed;
                    } else if (map.check(e.x, e.y - (int) e.speed)) {
                        e.y -= e.speed;
                       // System.out.println("y out bound");
                    } else {
                        System.out.println(e.x+" " + e.y);
                        System.out.println("never call me");
                        e.left();
                    }

                }


            }
        } catch (Exception e) {
            System.out.println("all enemy killed");

            win = true;
        }

        // status of enemy
        act++;

        for (Tower t : towers) {

            t.tick();

            for (Enemy e : enemys) {
                int dis = (int) Math.sqrt((t.x - e.x)*(t.x - e.x) +(t.y - e.y)*(t.y - e.y));

                if (dis <= t.scope) {
                    t.bullet.tick(e);
                    t.renBullet = true;
                }
                else {
                    t.bullet.rest();
                    t.renBullet = false;
                }

                //Collision

                if (Math.abs(t.bullet.x - e.x) <= t.bullet.scope && Math.abs(t.bullet.y - e.y) <= t.bullet.scope) {
                    e.health -= t.bullet.dame;
                }
            }
        }

        if (Game.getMouseManager().isLeftPressed()) {
            sPX = Game.getMouseManager().prX;
            sPY = Game.getMouseManager().prY;
            if (sPX >= 1000 && sPX < 1200 && sPY > 100 && sPY < 200) {
                isDragging = true;
                Game.getMouseManager().leftPressed = false;
            }

        }
    }

    public void render(Graphics g) {
        map.render(g);

        g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        g.setColor(Color.red);
        g.drawString("head ", 1030, 50);
        g.drawString(head +"", 1030, 100);
        if (head <= 0) {
            g.drawString("lose", 1050, 600);
        }
        g.setColor(Color.orange);
        g.drawString("Gold ", 1150,50);
        g.drawString(gold+"",1150,100);

        if (act >= Assets.aHead.size()-1)
            act = 0;
        try {
            for (Enemy e : enemys) {
                e.render(g);
            }
        } catch (Exception e) {
            if (enemys.isEmpty()) {
                g.setColor(Color.red);
                g.setFont(new Font("TimesRoman", Font.PLAIN, 80));
                g.drawString("win", 1050, 500);
            }
        }

        for (Tower t : towers) {
            t.render(g);
        }
        g.drawImage(Assets.t1, 1050, 150, null);


        //land tower
        if (isDragging) {

            if (Game.getMouseManager().rightPressed)
                isDragging = false;
            int prX = Game.getMouseManager().getMouseX() - Assets.t1.getWidth()/2;
            int prY = Game.getMouseManager().getMouseY() - Assets.t1.getHeight();


            g.drawImage(Assets.t1,Game.getMouseManager().getMouseX() - Assets.t1.getWidth()/2, Game.getMouseManager().getMouseY() - Assets.t1.getHeight(), null);

            if (Game.getMouseManager().isLeftPressed()) {


                System.out.println("! left press");

               if (map.isLandTower(prX, prY + Assets.t1.getHeight()) && prX > 0 && prX < 1000 && prY > 0 && prY < 1000 && gold >= 5) {
                   towers.add(new NormalTower(prX, prY));

                   gold -= 5;
               }
               isDragging = false;
            }


        }


    }


}

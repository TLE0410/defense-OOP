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

    private int act = 0;

    public gameField () {
        head = 10;
        gold = 0;

        numberEnemy = 5;

        //constructor map
        maps = new LinkedList<>();

        //constructor enemy
        enemys = new ArrayList<>();
        for (int i = 0; i < numberEnemy; ++i) {
            //after x time 1 enemy appear
            int ran = (int) Math.random()*(100 - 10 +1) + 1;

            enemys.add(new NormalEnemy(-100 - i*30, 40 + ran*i));
        }
        //constructor tower and bullet
        towers = new ArrayList<>();
        towers.add(new NormalTower(150,150));
        addMap();
        map = maps.poll();
    }

    public void addMap() {
        maps.add(new Map1());
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
                    if (map.left(e.x, e.y)) {
                        e.left();
                        System.out.println("left");
                    }
                    if (map.right(e.x, e.y)) {
                        e.right();
                        System.out.println("right");
                    }
                    if (map.up(e.x, e.y)) {
                        e.up();
                        System.out.println("up");
                    }
                    if (map.down(e.x, e.y)) {
                        e.down();
                        System.out.println("down");
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
                        System.out.println("x out bound right side");
                        e.x += e.speed;
                    } else if (e.x >= 900) {
                        e.x -= e.speed;
                        System.out.println(" x out bound left side");
                        System.out.println(e.x);
                    } else if (map.check(e.x, e.y - (int) e.speed)) {
                        System.out.println("y can't be reach");
                        e.y -= e.speed;
                    } else if (map.check(e.x, e.y - (int) e.speed)) {
                        e.y += e.speed;
                        System.out.println("y out bound");
                    } else {
                        e.down();
                    }

                }
            }
        } catch (Exception e) {
            System.out.println("all enemy killed");
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
    }

    public void render(Graphics g) {
        g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        g.setColor(Color.red);
        g.drawString("head ", 1030, 50);
        g.drawString(head +"", 1030, 100);
        g.setColor(Color.yellow);
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
                g.drawString("END", 400, 400);
            }
        }

        for (Tower t : towers) {
            t.render(g);
        }
    }

}

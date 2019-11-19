import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

public class Assets {
    public static final int eWidth = 56, eHeight = 47;
    //public static final int width = 70, height = 130, offset = 26, fOffset = 22;
    //public static final int offsetf = 28, fOffsetf = 39, widthf = 70, offsetW = 12;
    public static BufferedImage bg, bg0, newGame, quitButton;
    public static BufferedImage t1, bullet, blood, t2, wall, heart, coin, grass;
    public static BufferedImage n1, n2;
    public static List<BufferedImage> aHead, normalEnermy, normalEnemyF, tanker, tankerF, boss, bossF;
    public static List<BufferedImage> normalTower, fireTower, landTower, normalBullet, fireBullet, landBullet;
    public static Image start;

    public static BufferedImage resize(BufferedImage img, int height, int width) {
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

    public static void init(){
       // SpriteSheet sheet = new SpriteSheet((imageLoader.loadImage("image/bone1.png")));
       // SpriteSheet fsheet = new SpriteSheet((imageLoader.loadImage("image/bonef.png")));
        SpriteSheet tower = new SpriteSheet(imageLoader.loadImage("image/tower/towers.png"));

        SpriteSheet bloodBar = new SpriteSheet(imageLoader.loadImage("image/blood/bloodBar.png"));
        start = imageLoader.loadImage("image/menus/start.png");

        //add wall
        grass = imageLoader.loadImage("image/back_ground/grass.jpg");
        wall = imageLoader.loadImage("image/wall.jpg");
        heart = imageLoader.loadImage("image/menus/heart.png");
        heart = resize(heart,25,35);
        coin = imageLoader.loadImage("image/menus/coin.png");
        coin = resize(coin, 25,35);
        aHead = new ArrayList<>();
        normalEnermy = new ArrayList<>();
        normalEnemyF = new ArrayList<>();
        tanker = new ArrayList<>();
        tankerF = new ArrayList<>();
        boss = new ArrayList<>();
        bossF = new ArrayList<>();

        normalTower = new ArrayList<>();
        fireTower = new ArrayList<>();
        landTower = new ArrayList<>();

        normalBullet = new ArrayList<>();
        fireBullet = new ArrayList<>();
        landBullet = new ArrayList<>();

        // add normal enemy
        SpriteSheet n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w1.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w2.png"));
        n2 = n.crop(0,0,339, 285);
        n2 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w3.png"));
        n2 = n.crop(0,0,339, 285);
        n2 = resize(n2, eHeight, eWidth);
        normalEnermy.add(n2);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w4.png"));
        n2 = n.crop(0,0,339, 285);
        n2 = resize(n2, eHeight, eWidth);
        normalEnermy.add(n2);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w5.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w6.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w7.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w8.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w9.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w10.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w11.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w12.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w13.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w14.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w15.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w16.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w17.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w18.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w19.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w20.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnermy.add(n1);
        //end add normal enemy

        // add normal enemy flip
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w1f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w2f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w3f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w4f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w5f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w6f.png"));
        n1 = n.crop(0,0,339, 285);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w7f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w8f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w9f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w10f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w11f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w12f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w13f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w14f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w15f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w16f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w17f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w18f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w19f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/normal/w20f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        normalEnemyF.add(n1);


        //add tanker

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w1.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w2.png"));
        n2 = n.crop(0,0,339, 285);
        n2 = resize(n1, eHeight, eWidth);
        tanker.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w3.png"));
        n2 = n.crop(0,0,339, 285);
        n2 = resize(n2, eHeight, eWidth);
        tanker.add(n2);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w4.png"));
        n2 = n.crop(0,0,339, 285);
        n2 = resize(n2, eHeight, eWidth);
        tanker.add(n2);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w5.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w6.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w7.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w8.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w9.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w10.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w11.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w12.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w13.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w14.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w15.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w16.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w17.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w18.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w19.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w20.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tanker.add(n1);

        //end add tanker
        //add flip tanker
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w1f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w2f.png"));
        n2 = n.crop(0,0,339, 285);
        n2 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w3f.png"));
        n2 = n.crop(0,0,339, 285);
        n2 = resize(n2, eHeight, eWidth);
        tankerF.add(n2);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w4f.png"));
        n2 = n.crop(0,0,339, 285);
        n2 = resize(n2, eHeight, eWidth);
        tankerF.add(n2);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w5f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w6f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w7f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w8f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w9f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w10f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w11f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w12f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w13f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w14f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w15f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w16f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w17f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w18f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w19f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/tank/w20f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        tankerF.add(n1);
        //end add flip tanker
        //add boss
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w0.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w1.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w2.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w3.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w4.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w5.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w6.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w7.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w8.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w9.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w10.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w11.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w12.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w13.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w14.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w15.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w16.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w17.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w18.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        boss.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w19.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);

        //end add boss
        //add flip boss
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w0f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w1f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w2f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w3f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w4f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w5f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w6f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w7f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w8f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w9f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w10f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w11f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w12f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w13f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w14f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w15f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w16f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w17f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w18f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/Enemy/Boss/w19f.png"));
        n1 = n.crop(0,0,339, 285);
        n1 = resize(n1, eHeight, eWidth);
        bossF.add(n1);
        //end add flip boss

        //add normal tower

        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower1/t1.png"));
        n1 = n.crop(0,0,200, 200);

        normalTower.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower1/t2.png"));
        n1 = n.crop(0,0,200, 200);

        normalTower.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower1/t3.png"));
        n1 = n.crop(0,0,200, 200);

        normalTower.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower1/t4.png"));
        n1 = n.crop(0,0,300, 300);

        normalTower.add(n1);

        //end add normal tower

        //add fire tower

        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower2/t1.png"));
        n1 = n.crop(0,0,300, 300);

        fireTower.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower2/t2.png"));
        n1 = n.crop(0,0,300, 300);

        fireTower.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower2/t3.png"));
        n1 = n.crop(0,0,300, 300);

        fireTower.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower2/t4.png"));
        n1 = n.crop(0,0,300, 300);

        fireTower.add(n1);

        //end add fire tower

        //add land tower
        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower3/t1.png"));
        n1 = n.crop(0,0,300, 300);

        landTower.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower3/t2.png"));
        n1 = n.crop(0,0,300, 300);

        landTower.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower3/t3.png"));
        n1 = n.crop(0,0,300, 300);

        landTower.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/tower/Tower3/t4.png"));
        n1 = n.crop(0,0,300, 300);

        landTower.add(n1);
        //end add land tower
        //add normal bullet

        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet1/40.png"));
        n1 = n.crop(0,0,40, 32);

        normalBullet.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet1/41.png"));
        n1 = n.crop(0,0,55, 46);

        normalBullet.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet1/42.png"));
        n1 = n.crop(0,0,63, 59);

        normalBullet.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet1/43.png"));
        n1 = n.crop(0,0,96, 87);

        normalBullet.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet1/44.png"));
        n1 = n.crop(0,0,109, 118);

        normalBullet.add(n1);

        //end add normal bullet

        //add fire bullet

        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet2/35.png"));
        n1 = n.crop(0,0,41, 94);

        fireBullet.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet2/36.png"));
        n1 = n.crop(0,0,79, 64);

        fireBullet.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet2/37.png"));
        n1 = n.crop(0,0,82, 88);

        fireBullet.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet2/38.png"));
        n1 = n.crop(0,0,108, 108);

        fireBullet.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet2/39.png"));
        n1 = n.crop(0,0,122, 119);

        fireBullet.add(n1);

        //end add fire bullet

        //add land tower

        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet3/29.png"));
        n1 = n.crop(0,0,62, 57);

        landBullet.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet3/30.png"));
        n1 = n.crop(0,0,46, 38);

        landBullet.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet3/31.png"));
        n1 = n.crop(0,0,53, 49);

        landBullet.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet3/32.png"));
        n1 = n.crop(0,0,80, 70);
        landBullet.add(n1);
        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet3/33.png"));
        n1 = n.crop(0,0,89, 74);

        landBullet.add(n1);

        n = new SpriteSheet(imageLoader.loadImage("image/bullet/Bullet3/34.png"));
        n1 = n.crop(0,0,106, 104);

        landBullet.add(n1);

        //end add land tower

        blood = bloodBar.crop(20,0,1250,90);
        blood = resize(blood,6,70);
        t1 = tower.crop(50,80,460,970);

        t1 = resize(t1,100,60);


        /*
        p1 = sheet.crop(fOffset,565,width,height);
        p2 = sheet.crop(width + fOffset + offset,565,width,height);
        p3 = sheet.crop(2*width +fOffset+2*offset,565,width,height);
        p4 = sheet.crop(3*width +fOffset+ 3*offset,565,width,height);
        p5 = sheet.crop(4*width+fOffset+4*offset,565,width,height);
        p6 = sheet.crop(5*width+fOffset +5*offset,565,width,height);
        p7 = sheet.crop(6*width+fOffset + 6*offset,565,width,height);
        p8 = sheet.crop(7*width+fOffset + 7*offset,565,width,height);
        p9 = sheet.crop(8*width+fOffset + 8*offset,565,width,height);
        p10 = sheet.crop(9*width+fOffset + 9*offset,565,width,height);
        p11 = sheet.crop(10*width+fOffset + 10*offset,565,width,height);
        p12 = sheet.crop(11*width+fOffset + 11*offset,565,width,height);
        p1 = resize(p1,height/3, width/3);
        p2 = resize(p2,height/3, width/3);
        p3 = resize(p3,height/3, width/3);
        p4 = resize(p4,height/3, width/3);
        p5 = resize(p5,height/3, width/3);
        p6 = resize(p6,height/3, width/3);
        p7 = resize(p7,height/3, width/3);
        p8 = resize(p8,height/3, width/3);
        p9 = resize(p9,height/3, width/3);
        p10 = resize(p10,height/3, width/3);
        p11 = resize(p11,height/3, width/3);
        p12 = resize(p12,height/3, width/3);
        aHead.add(p1);
        aHead.add(p2);
        aHead.add(p3);
        aHead.add(p4);
        aHead.add(p5);
        aHead.add(p6);
        aHead.add(p7);
        aHead.add(p8);
        aHead.add(p9);
        aHead.add(p10);
        aHead.add(p11);
        aHead.add(p12);

        //flip

        fp1 = fsheet.crop(fOffset,565,width,height);
        fp2 = fsheet.crop(widthf + fOffsetf + offsetf,565,width+offsetW,height);
        fp3 = fsheet.crop(2*widthf +fOffsetf+2*offsetf,565,width+offsetW,height);
        fp4 = fsheet.crop(3*widthf +fOffsetf+ 3*offsetf,565,width+offsetW,height);
        fp5 = fsheet.crop(4*widthf+fOffsetf+4*offsetf,565,width+offsetW,height);
        fp6 = fsheet.crop(5*widthf+fOffsetf +5*offsetf,565,width+offsetW,height);
        fp7 = fsheet.crop(6*widthf+fOffsetf + 6*offsetf,565,width+offsetW,height);
        fp8 = fsheet.crop(7*widthf+fOffsetf + 7*offsetf,565,width+offsetW,height);
        fp9 = fsheet.crop(8*widthf+fOffsetf + 8*offsetf,565,width+offsetW,height);
        fp10 = fsheet.crop(9*widthf+fOffsetf + 9*offsetf,565,width+offsetW,height);
        fp11 = fsheet.crop(10*widthf+fOffsetf + 10*offsetf,565,width+offsetW,height);
        fp12 = fsheet.crop(11*widthf+fOffsetf + 11*offsetf,565,width+offsetW,height);
        fp1 = resize(fp1,height/3, (width+offsetW)/3);
        fp2 = resize(fp2,height/3, width/3+offsetW/3);
        fp3 = resize(fp3,height/3, width/3+offsetW/3);
        fp4 = resize(fp4,height/3, width/3+offsetW/3);
        fp5 = resize(fp5,height/3, width/3+offsetW/3);
        fp6 = resize(fp6,height/3, width/3+offsetW/3);
        fp7 = resize(fp7,height/3, width/3+offsetW/3);
        fp8 = resize(fp8,height/3, width/3+offsetW/3);
        fp9 = resize(fp9,height/3, width/3+offsetW/3);
        fp10 = resize(fp10,height/3, width/3+offsetW/3);
        fp11 = resize(fp11,height/3, width/3+offsetW/3);
        fp12 = resize(fp12,height/3, width/3+offsetW/3);
        */


        //background image
        bg = imageLoader.loadImage("image/back_ground/bg2.jpg");
        bg = resize(bg, 700, 1000);
        bg0 = imageLoader.loadImage("image/back_ground/bg0.jpg");
        bg0 = resize(bg0, 700, 1000);
        newGame = imageLoader.loadImage("image/new game.jpg");
        quitButton = imageLoader.loadImage("image/menus/quitB.png");

    }

}

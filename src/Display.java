import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseMotionListener;

public class Display {

    protected JFrame frame;
    private Canvas canvas;

    private String title;
    protected int width;
    protected int height;
    protected Game game;
    protected MouseListener mouse;

    public JLabel jB = new JLabel();

    public Display(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();
    }

    public void createDisplay(){
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        waitSense();
        mouse = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }


        };
        addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println(e.getX()+ " " + e.getY() + "dragging");
            }

            @Override
            public void mouseMoved(MouseEvent e) { }

        });

        canvas = new Canvas();
        canvas.setPreferredSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMaximumSize(new Dimension(width, height));
        canvas.setMinimumSize(new Dimension(width, height));
        canvas.setFocusable(false);

        frame.add(canvas);
        frame.pack();

    }

    public Canvas getCanvas(){
        return canvas;
    }
    public JFrame getFrame(){
        return frame;
    }

    public void waitSense () {
/*
        try {
            jB = new JLabel(new ImageIcon(ImageIO.read(new File("image/bg4.jpg"))));

        } catch (IOException e) {
            e.printStackTrace();
        }

 */
       // frame.setContentPane(jB);
        JButton b = new JButton();
        b.setSize(new Dimension(250, 100));
        b.setMaximumSize(new Dimension(250, 100));
        b.setLocation(this.width/2 - 250 + 100,this.height/2 - 100);
        b.setLayout(null);

        b.setIcon(new ImageIcon("image/menus/start.png"));

        frame.getContentPane().add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.start();
                frame.remove(b);
                //frame.remove(jB);
            }
        });

    }

}

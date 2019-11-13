import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Display {

    protected JFrame frame;
    private Canvas canvas;

    private String title;
    protected int width;
    protected int height;
    protected Game game;
    protected MouseListener mouse;

    public JLabel jB = new JLabel();
    protected JPanel pane;
    private JButton b;

    public Display(String title, int width, int height){
        this.title = title;
        this.width = width;
        this.height = height;

        createDisplay();
    }

    public void createDisplay(){
        frame = new JFrame(title);
        Assets.init();

        // waiting sense

         pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(Assets.newGame, 0, 0, null);
            }
        };
         //waitSense();

        frame.getContentPane().add(pane);

        frame.setSize(width, height);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setBackground(Color.GREEN);
       // waitSense();

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

        b = new JButton();
        b.setSize(new Dimension(250, 100));
        b.setMaximumSize(new Dimension(250, 100));
        b.setLocation(this.width/2 - 250 + 100,this.height/2 - 100);
        b.setLayout(null);

        b.setIcon(new ImageIcon("image/menus/start.png"));

        frame.getContentPane().add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(b);
                frame.remove(pane);
                game.start();
            }
        });



    }

}

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game implements Runnable{
    private Display display;
    protected static int width, height;
    private String title;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    //State
    private State gameState;

    public Game(String title, int width, int height){

        this.title = title;
        this.width = width;
        this.height = height;

        init();

    }
    public void waiting () {
        display.game = this;
    }

    private void init(){

        display = new Display(title, width, height);
        Assets.init();

        gameState = new gameState(this);

        gameState.setState(gameState);
    }

    private void tick(){

        if(gameState.getState() != null)
            gameState.getState().tick();
    }

    private void render(){
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }

        g = bs.getDrawGraphics();
        //CLear Screen

        g.clearRect(0,0,width,height);

        //DRAW HERE

        g.drawImage(Assets.bg,0,0,null);


        if(gameState.getState() != null)
            gameState.getState().render(g);

        //END DRAWING
        bs.show();
        g.dispose();

    }

    public void run(){

        int fps = 60;
        double timePerTick = 100000000/fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();

        while(running){

            now = System.nanoTime();
            delta+= (now - lastTime)/timePerTick;
            lastTime = now;

            if(delta >=16) {

                tick();
                render();
                delta -=16;
            }
        }

        stop();

    }


    public synchronized void start(){
        if(running)
            return;
        running = true;
        thread = new Thread(this::run);
        thread.start();
    }

    public synchronized void stop(){
        if(!running)
            return;
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

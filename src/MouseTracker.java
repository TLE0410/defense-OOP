import java.awt.*;
import java.awt.event.*;
import java.util.Map;

public class MouseTracker extends Frame implements MouseListener,
        MouseMotionListener {
    private Frame statusBar;
    protected double x, y;
    protected boolean clicked, pressed, released, entered, dragged, Moved, Exit;
    private Map<String, Boolean> check;


    // set up GUI and register mouse event handlers
    public MouseTracker(Frame statusBar) {
        super("Demonstrating Mouse Events");
        this.statusBar = statusBar;

        this.add(statusBar, BorderLayout.SOUTH);
        // application listens to its own mouse events
        addMouseListener(this);
        addMouseMotionListener(this);

    }

    public void init () {
        clicked = false;
        pressed = false;
        released = false;
        dragged = false;
    }

    // MouseListener event handlers
    // handle event when mouse released immediately
    // after press
    public void mouseClicked(MouseEvent event) {

        this.x = event.getX();
        this.y = event.getY();
        clicked = true;
    }

    // handle event when mouse pressed
    public void mousePressed(MouseEvent event) {
        clicked = true;
        pressed = true;
    }

    // handle event when mouse released after dragging
    public void mouseReleased(MouseEvent event) {
        clicked = false;
        released = false;
    }

    // handle event when mouse enters area
    public void mouseEntered(MouseEvent event) {

    }

    // handle event when mouse exits area
    public void mouseExited(MouseEvent event) {
       // statusBar.setText("Mouse outside window");
    }

    // MouseMotionListener event handlers
    // handle event when user drags mouse with button pressed
    public void mouseDragged(MouseEvent event) {
       // statusBar.setText("Dragged at [" + event.getX() + ", " + event.getY()
       //         + "]");
        this.x = x;
        this.y = y;
        dragged = true;
    }

    // handle event when user moves mouse
    public void mouseMoved(MouseEvent event) {
       // statusBar.setText("Moved at [" + event.getX() + ", " + event.getY()
        //        + "]");
    }

    // execute application
    public static void main(String args[]) {
        //MouseTracker application = new MouseTracker();
    }
} // end class MouseTracker
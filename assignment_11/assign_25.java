import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class as_11_q_25 extends JFrame implements MouseMotionListener, MouseListener {
    int x1, y1, x2, y2;

    as_11_q_25() {
        addMouseMotionListener(this);
        addMouseListener(this);
        setSize(500, 400);
        setTitle("Freehand Sketch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new as_11_q_25();
    }

    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    public void mouseDragged(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        Graphics g = getGraphics();
        g.drawLine(x1, y1, x2, y2);
        x1 = x2;
        y1 = y2;
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }
}

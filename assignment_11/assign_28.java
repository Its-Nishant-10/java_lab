import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class as_11_q_28 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Drag and Drop");
        JButton b = new JButton("Drag Me");
        b.setBounds(150, 100, 100, 40);
        final int[] x = new int[1];
        final int[] y = new int[1];
        b.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                x[0] = e.getX();
                y[0] = e.getY();
            }
        });
        b.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                int newX = b.getX() + e.getX() - x[0];
                int newY = b.getY() + e.getY() - y[0];
                b.setLocation(newX, newY);
            }
        });
        f.add(b);
        f.setSize(450, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

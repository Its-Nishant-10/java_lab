import javax.swing.*;
import java.awt.*;

class as_11_q_26 extends JFrame {
    as_11_q_26() {
        setSize(500, 400);
        setTitle("Memory Graph");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new as_11_q_26();
    }

    public void paint(Graphics g) {
        super.paint(g);
        Runtime r = Runtime.getRuntime();
        long total = r.totalMemory() / 1000000;
        long free = r.freeMemory() / 1000000;
        long used = total - free;
        int usedHeight = (int) used * 3;
        int freeHeight = (int) free * 3;
        g.drawString("Total Memory: " + total + " MB", 50, 80);
        g.drawString("Used Memory: " + used + " MB", 50, 100);
        g.drawString("Free Memory: " + free + " MB", 50, 120);
        g.fillRect(100, 300 - usedHeight, 50, usedHeight);
        g.fillRect(200, 300 - freeHeight, 50, freeHeight);
        g.drawString("Used", 105, 320);
        g.drawString("Free", 205, 320);
    }
}

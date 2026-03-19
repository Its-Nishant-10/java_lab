import javax.swing.*;
import java.awt.*;

class as_11_q_19 extends JFrame {
    static String shape = "";

    as_11_q_19() {
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("Shapes");
        JMenuItem c = new JMenuItem("Circle");
        JMenuItem r = new JMenuItem("Rectangle");
        JMenuItem l = new JMenuItem("Line");
        c.addActionListener(e -> {
            shape = "circle";
            repaint();
        });
        r.addActionListener(e -> {
            shape = "rectangle";
            repaint();
        });
        l.addActionListener(e -> {
            shape = "line";
            repaint();
        });
        m.add(c);
        m.add(r);
        m.add(l);
        mb.add(m);
        setJMenuBar(mb);
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new as_11_q_19();
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (shape.equals("circle"))
            g.drawOval(150, 100, 100, 100);
        if (shape.equals("rectangle"))
            g.drawRect(150, 100, 120, 80);
        if (shape.equals("line"))
            g.drawLine(100, 150, 300, 150);
    }
}

import javax.swing.*;
import java.awt.*;

class as_11_q_20 extends JFrame {
    static String light = "";

    as_11_q_20() {
        JButton b1 = new JButton("Red");
        JButton b2 = new JButton("Yellow");
        JButton b3 = new JButton("Green");
        b1.setBounds(50, 220, 80, 30);
        b2.setBounds(150, 220, 80, 30);
        b3.setBounds(250, 220, 80, 30);
        b1.addActionListener(e -> {
            light = "red";
            repaint();
        });
        b2.addActionListener(e -> {
            light = "yellow";
            repaint();
        });
        b3.addActionListener(e -> {
            light = "green";
            repaint();
        });
        add(b1);
        add(b2);
        add(b3);
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new as_11_q_20();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawRect(150, 70, 80, 120);
        g.setColor(light.equals("red") ? Color.RED : Color.LIGHT_GRAY);
        g.fillOval(170, 80, 40, 30);
        g.setColor(light.equals("yellow") ? Color.YELLOW : Color.LIGHT_GRAY);
        g.fillOval(170, 115, 40, 30);
        g.setColor(light.equals("green") ? Color.GREEN : Color.LIGHT_GRAY);
        g.fillOval(170, 150, 40, 30);
    }
}

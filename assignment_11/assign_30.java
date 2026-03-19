import javax.swing.*;
import java.awt.*;

class as_11_q_30 extends JFrame {
    String names[] = {"A", "B", "C"};
    int marks[] = {80, 60, 90};

    as_11_q_30() {
        String data[][] = {{"A", "80"}, {"B", "60"}, {"C", "90"}};
        String col[] = {"Name", "Marks"};
        JTable table = new JTable(data, col);
        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(20, 40, 200, 100);
        add(sp);
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new as_11_q_30();
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < marks.length; i++) {
            g.fillRect(280 + i * 60, 300 - marks[i], 40, marks[i]);
            g.drawString(names[i], 290 + i * 60, 320);
        }
    }
}

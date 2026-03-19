import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_18 {
    public static void main(String[] args) {
        JFrame f = new JFrame("CardLayout Example");
        CardLayout cl = new CardLayout();
        JPanel cards = new JPanel(cl);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.add(new JLabel("This is Panel 1"));
        p2.add(new JLabel("This is Panel 2"));
        cards.add(p1, "1");
        cards.add(p2, "2");
        JButton b1 = new JButton("Panel 1");
        JButton b2 = new JButton("Panel 2");
        b1.setBounds(50, 20, 100, 30);
        b2.setBounds(200, 20, 100, 30);
        cards.setBounds(50, 80, 300, 150);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(cards, "1");
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cl.show(cards, "2");
            }
        });
        f.add(b1);
        f.add(b2);
        f.add(cards);
        f.setSize(450, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

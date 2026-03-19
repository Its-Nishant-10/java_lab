import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_9 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Font and Color Change");
        JLabel l = new JLabel("Nishant Here");
        JButton b1 = new JButton("Font Size");
        JButton b2 = new JButton("Color");
        l.setBounds(120, 50, 200, 30);
        b1.setBounds(70, 120, 100, 30);
        b2.setBounds(190, 120, 100, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setFont(new Font("Arial", Font.BOLD, 24));
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setForeground(Color.RED);
            }
        });
        f.add(l);
        f.add(b1);
        f.add(b2);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

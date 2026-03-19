import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Random Color");

        JButton b = new JButton("Change Color");

        b.setBounds(100, 100, 150, 40);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color c = new Color(
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255),
                        (int) (Math.random() * 255)
                );

                f.getContentPane().setBackground(c);
            }
        });

        f.add(b);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

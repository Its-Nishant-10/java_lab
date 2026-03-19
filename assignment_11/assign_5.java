import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_5 {
    static int y = 50;

    public static void main(String[] args) {
        JFrame f = new JFrame("Dynamic Buttons");
        JButton add = new JButton("Add Button");
        add.setBounds(100, 10, 120, 30);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = new JButton("New");
                b.setBounds(100, y, 100, 30);
                y += 40;
                f.add(b);
                f.repaint();
            }
        });
        f.add(add);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

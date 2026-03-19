import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_6 {
    static int x = 50;

    public static void main(String[] args) {
        JFrame f = new JFrame("Moving Label");
        JLabel l = new JLabel("Moving");
        JButton b = new JButton("Move");
        l.setBounds(x, 100, 100, 30);
        b.setBounds(120, 180, 100, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x += 20;
                l.setBounds(x, 100, 100, 30);
                f.repaint();
            }
        });
        f.add(l);
        f.add(b);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

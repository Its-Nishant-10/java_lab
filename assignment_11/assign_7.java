import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_7 {
    static int count = 0;

    public static void main(String[] args) {
        JFrame f = new JFrame("Button Counter");

        JButton b = new JButton("Click");
        JLabel l = new JLabel("Count = 0");

        b.setBounds(120, 80, 100, 30);
        l.setBounds(130, 140, 100, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;
                l.setText("Count = " + count);
            }
        });

        f.add(b);
        f.add(l);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

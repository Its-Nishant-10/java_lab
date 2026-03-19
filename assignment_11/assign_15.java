import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_15 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Theme Change");
        JRadioButton r1 = new JRadioButton("Light");
        JRadioButton r2 = new JRadioButton("Dark");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        r1.setBounds(100, 80, 100, 30);
        r2.setBounds(200, 80, 100, 30);
        r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.getContentPane().setBackground(Color.WHITE);
            }
        });
        r2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                f.getContentPane().setBackground(Color.GRAY);
            }
        });
        f.add(r1);
        f.add(r2);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

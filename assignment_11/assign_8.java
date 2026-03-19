import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_8 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Enable Disable Buttons");
        JButton target = new JButton("Target");
        JButton disable = new JButton("Disable");
        JButton enable = new JButton("Enable");
        target.setBounds(130, 50, 100, 30);
        disable.setBounds(70, 120, 100, 30);
        enable.setBounds(190, 120, 100, 30);
        disable.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                target.setEnabled(false);
            }
        });
        enable.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                target.setEnabled(true);
            }
        });
        f.add(target);
        f.add(disable);
        f.add(enable);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

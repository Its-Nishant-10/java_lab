import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Arithmetic Operations");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        JButton b3 = new JButton("*");
        JButton b4 = new JButton("/");
        JLabel l = new JLabel();
        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(200, 50, 100, 30);
        b1.setBounds(40, 100, 50, 30);
        b2.setBounds(100, 100, 50, 30);
        b3.setBounds(160, 100, 50, 30);
        b4.setBounds(220, 100, 50, 30);
        l.setBounds(120, 150, 150, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                l.setText("Result = " + (a + b));
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                l.setText("Result = " + (a - b));
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                l.setText("Result = " + (a * b));
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                l.setText("Result = " + (a / b));
            }
        });
        f.add(t1);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(l);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

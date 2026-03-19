import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_11 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Calculator");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");
        JLabel l = new JLabel();
        t1.setBounds(50, 50, 100, 30);
        t2.setBounds(200, 50, 100, 30);
        add.setBounds(40, 100, 50, 30);
        sub.setBounds(100, 100, 50, 30);
        mul.setBounds(160, 100, 50, 30);
        div.setBounds(220, 100, 50, 30);
        l.setBounds(120, 150, 150, 30);
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                l.setText("Result = " + (a + b));
            }
        });
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                l.setText("Result = " + (a - b));
            }
        });
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                l.setText("Result = " + (a * b));
            }
        });
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(t1.getText());
                double b = Double.parseDouble(t2.getText());
                l.setText("Result = " + (a / b));
            }
        });
        f.add(t1);
        f.add(t2);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);
        f.add(l);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

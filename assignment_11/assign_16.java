import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_16 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration");
        JLabel l1 = new JLabel("Name");
        JLabel l2 = new JLabel("Email");
        JLabel l3 = new JLabel("Age");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JButton b = new JButton("Submit");
        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 150, 30);
        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 150, 30);
        l3.setBounds(50, 150, 100, 30);
        t3.setBounds(150, 150, 150, 30);
        b.setBounds(120, 210, 100, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String email = t2.getText();
                String age = t3.getText();
                if (name.equals("") || !email.contains("@")) {
                    JOptionPane.showMessageDialog(f, "Invalid Input");
                } else {
                    try {
                        Integer.parseInt(age);
                        JOptionPane.showMessageDialog(f, "Registration Successful");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(f, "Age must be number");
                    }
                }
            }
        });
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b);
        f.setSize(400, 350);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

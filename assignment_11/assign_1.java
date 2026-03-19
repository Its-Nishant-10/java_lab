import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_1 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login Form");
        JLabel l1 = new JLabel("Username:");
        JLabel l2 = new JLabel("Password:");
        JTextField t1 = new JTextField();
        JPasswordField t2 = new JPasswordField();
        JButton b = new JButton("Login");
        l1.setBounds(50, 50, 100, 30);
        t1.setBounds(150, 50, 150, 30);
        l2.setBounds(50, 100, 100, 30);
        t2.setBounds(150, 100, 150, 30);
        b.setBounds(120, 150, 100, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = t1.getText();
                String pass = new String(t2.getPassword());
                if (user.equals("nishant") && pass.equals("1021"))
                    JOptionPane.showMessageDialog(f, "Login Successful");
                else
                    JOptionPane.showMessageDialog(f, "Invalid Login");
            }
        });
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

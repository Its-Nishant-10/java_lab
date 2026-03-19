import javax.swing.*;

class as_11_q_22 {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("User 1");
        JFrame f2 = new JFrame("User 2");
        JTextArea a1 = new JTextArea();
        JTextArea a2 = new JTextArea();
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b1 = new JButton("Send");
        JButton b2 = new JButton("Send");
        a1.setBounds(20, 20, 250, 150);
        t1.setBounds(20, 180, 180, 30);
        b1.setBounds(210, 180, 60, 30);
        a2.setBounds(20, 20, 250, 150);
        t2.setBounds(20, 180, 180, 30);
        b2.setBounds(210, 180, 60, 30);
        b1.addActionListener(e -> {
            String msg = t1.getText();
            a1.append("User1: " + msg + "\n");
            a2.append("User1: " + msg + "\n");
            t1.setText("");
        });
        b2.addActionListener(e -> {
            String msg = t2.getText();
            a2.append("User2: " + msg + "\n");
            a1.append("User2: " + msg + "\n");
            t2.setText("");
        });
        f1.add(a1);
        f1.add(t1);
        f1.add(b1);
        f2.add(a2);
        f2.add(t2);
        f2.add(b2);
        f1.setSize(320, 300);
        f2.setSize(320, 300);
        f1.setLayout(null);
        f2.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
        f2.setVisible(true);
    }
}

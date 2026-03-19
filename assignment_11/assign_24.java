import javax.swing.*;
import java.time.LocalTime;

class as_11_q_24 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Digital Clock");
        JLabel l = new JLabel();
        JTextField t = new JTextField();
        JButton b = new JButton("Set Alarm");
        l.setBounds(120, 50, 200, 30);
        t.setBounds(100, 100, 150, 30);
        b.setBounds(120, 150, 100, 30);
        final String[] alarm = {""};
        b.addActionListener(e -> {
            alarm[0] = t.getText();
        });
        Timer timer = new Timer(1000, e -> {
            String now = LocalTime.now().withNano(0).toString();
            l.setText(now);
            if (now.equals(alarm[0])) {
                JOptionPane.showMessageDialog(f, "Alarm Time Reached!");
            }
        });
        timer.start();
        f.add(l);
        f.add(t);
        f.add(b);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

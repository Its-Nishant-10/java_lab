import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_12 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Guess Number");
        int num = (int) (Math.random() * 10) + 1;
        JTextField t = new JTextField();
        JButton b = new JButton("Guess");
        JLabel l = new JLabel();
        t.setBounds(120, 50, 100, 30);
        b.setBounds(120, 100, 100, 30);
        l.setBounds(100, 150, 200, 30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int g = Integer.parseInt(t.getText());
                if (g == num)
                    l.setText("Correct Guess");
                else
                    l.setText("Wrong Guess");
            }
        });
        f.add(t);
        f.add(b);
        f.add(l);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

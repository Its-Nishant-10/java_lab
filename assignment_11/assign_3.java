import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

class as_11_q_3 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Digital Clock");

        JLabel l = new JLabel();

        l.setBounds(120, 100, 200, 30);

        Timer t = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                l.setText(sdf.format(new Date()));
            }
        });

        t.start();

        f.add(l);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

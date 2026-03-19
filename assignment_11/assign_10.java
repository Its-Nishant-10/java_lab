import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class as_11_q_10 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Confirmation Dialog");
        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int x = JOptionPane.showConfirmDialog(
                        f,
                        "Do you want to exit?"
                );
                if (x == JOptionPane.YES_OPTION)
                    f.dispose();
            }
        });
        f.setVisible(true);
    }
}

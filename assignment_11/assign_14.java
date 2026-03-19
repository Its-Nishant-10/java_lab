import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_14 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Image Loader");
        JButton b = new JButton("Load Image");
        JLabel l = new JLabel();
        b.setBounds(120, 20, 120, 30);
        l.setBounds(50, 70, 300, 200);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser fc = new JFileChooser();
                int x = fc.showOpenDialog(f);
                if (x == JFileChooser.APPROVE_OPTION) {
                    String path = fc.getSelectedFile().getAbsolutePath();
                    ImageIcon img = new ImageIcon(path);
                    l.setIcon(img);
                }
            }
        });
        f.add(b);
        f.add(l);
        f.setSize(400, 350);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

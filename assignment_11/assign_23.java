import javax.swing.*;
import java.awt.*;

class as_11_q_23 extends JFrame {
    int arr[] = {100, 50, 150, 80, 120};

    as_11_q_23() {
        JButton b = new JButton("Sort");
        b.setBounds(150, 250, 100, 30);
        b.addActionListener(e -> {
            new Thread(() -> sort()).start();
        });
        add(b);
        setSize(400, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new as_11_q_23();
    }

    void sort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    repaint();
                    try {
                        Thread.sleep(500);
                    } catch (Exception ex) {
                    }
                }
            }
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < arr.length; i++) {
            g.fillRect(50 + i * 60, 220 - arr[i], 40, arr[i]);
        }
    }
}

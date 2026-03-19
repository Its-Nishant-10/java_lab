import javax.swing.*;

class as_11_q_21 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Progress Bar");
        JProgressBar pb = new JProgressBar(0, 100);
        JButton b = new JButton("Start");
        pb.setBounds(50, 50, 300, 30);
        b.setBounds(140, 120, 100, 30);
        b.addActionListener(e -> {
            new Thread(() -> {
                for (int i = 0; i <= 100; i++) {
                    pb.setValue(i);
                    try {
                        Thread.sleep(100);
                    } catch (Exception ex) {
                    }
                }
            }).start();
        });
        f.add(pb);
        f.add(b);
        f.setSize(400, 250);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

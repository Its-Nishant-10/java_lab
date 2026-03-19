import javax.swing.*;

class as_11_q_29 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Multi Tab Editor");
        JTabbedPane tp = new JTabbedPane();
        JTextArea t1 = new JTextArea();
        JTextArea t2 = new JTextArea();
        JTextArea t3 = new JTextArea();
        tp.add("Tab 1", new JScrollPane(t1));
        tp.add("Tab 2", new JScrollPane(t2));
        tp.add("Tab 3", new JScrollPane(t3));
        f.add(tp);
        f.setSize(500, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

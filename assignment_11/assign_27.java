import javax.swing.*;
import java.io.File;

class as_11_q_27 {
    public static void main(String[] args) {
        JFrame f = new JFrame("File Explorer");
        JButton b = new JButton("Open Folder");
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        JScrollPane sp = new JScrollPane(list);
        b.setBounds(150, 20, 120, 30);
        sp.setBounds(50, 70, 300, 200);
        b.addActionListener(e -> {
            JFileChooser fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int result = fc.showOpenDialog(f);
            if (result == JFileChooser.APPROVE_OPTION) {
                File folder = fc.getSelectedFile();
                model.clear();
                File[] files = folder.listFiles();
                for (File file : files) {
                    model.addElement(file.getName());
                }
            }
        });
        f.add(b);
        f.add(sp);
        f.setSize(450, 350);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

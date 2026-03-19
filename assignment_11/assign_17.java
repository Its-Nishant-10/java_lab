import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class as_11_q_17 {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTable Example");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("Add");
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Name");
        model.addColumn("Age");
        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
        t1.setBounds(50, 30, 100, 30);
        t2.setBounds(170, 30, 100, 30);
        b.setBounds(290, 30, 70, 30);
        sp.setBounds(50, 80, 300, 150);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                model.addRow(new Object[]{
                        t1.getText(),
                        t2.getText()
                });
            }
        });
        f.add(t1);
        f.add(t2);
        f.add(b);
        f.add(sp);
        f.setSize(450, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

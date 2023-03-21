import javax.swing.*;
import javax.swing.table.*;

public class lab5Qn10 {
    public lab5Qn10() {
        JFrame f=new JFrame();

        String[] columnNames = {"ID", "Name", "Project", "Price in $"};
        Object[][] data = {
                {1234, "John", "Pencil", 10},
                {4382, "Mirian", "Pen", 11},
                {2345, "Katy", "Chair", 253},
                {6334, "Agnes", "Table", 456},
                {1177, "Stanley", "flower", 25},
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        f.add(scrollPane);

        f.setTitle("Table Example");
        f.setSize(400, 300);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
            new lab5Qn10();

    }
}
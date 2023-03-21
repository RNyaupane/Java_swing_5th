import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
public class lab5Qn8 extends JFrame {
 
  private JList colorList, copyList;
  private JButton copy;
  private String colorNames[]
      = {"Apple","Orange","Banana","Grapes","Guava","Mango"};
 
  public lab5Qn8() {
 
    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    this.setSize(500,150);
 
    colorList = new JList(colorNames);
    colorList.setVisibleRowCount(5);
    colorList.setFixedCellHeight(15);
    colorList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    c.add(new JScrollPane(colorList));
 
    copy = new JButton("Copy >>>");
    copy.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        copyList.setListData(colorList.getSelectedValues());
      }
    });
    c.add(copy);
 
    copyList = new JList();
    copyList.setVisibleRowCount(5);
    copyList.setFixedCellWidth(100);
    copyList.setFixedCellHeight(15);
    copyList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    c.add(new JScrollPane(copyList));
 
    this.show();
  }
 
  public static void main(String args[]) {
    // JFrame.setDefaultLookAndFeelDecorated(true);
        new lab5Qn8();
  }
}
 
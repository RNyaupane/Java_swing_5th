import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class lab3Qn2 extends JFrame implements ActionListener {
   private JLabel label;
   private JTextField text;
   private JButton addBtn, removeBtn, resetBtn;
   private int count;
   public lab3Qn2() {
      setTitle("Counter Test");
      setLayout(new FlowLayout());
      count = 0;
      label = new JLabel("Count:");
      text = new JTextField("0", 4);
      addBtn = new JButton("Up");
      removeBtn = new JButton("Down");
      resetBtn = new JButton("Reset");
      addBtn.addActionListener(this);
      removeBtn.addActionListener(this);
      resetBtn.addActionListener(this);
      add(label);
      add(text);
      add(addBtn);
      add(removeBtn);
      add(resetBtn);
      setSize(375, 250);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent ae) {
      if (ae.getSource() == addBtn) {
         count++; // increment the coiunt by 1
         text.setText(String.valueOf(count));
         repaint();
      } else if (ae.getSource() == removeBtn) {
         count--; // decrement the count by 1
         text.setText(String.valueOf(count));
         repaint();
      } else if (ae.getSource() == resetBtn) {
         count = 0; // reset the count to 0
         text.setText(String.valueOf(count));
         repaint();
      }
   }
   public static void main(String[] args) {
      new lab3Qn2();
   }
}
import javax.swing.*;
import java.awt.event.*;

public class lab5Qn5 extends JFrame implements ItemListener {
    JLabel l, l1;
    JCheckBox cb1, cb2, cb3, cb4;
    JButton b;

    lab5Qn5() {
        l = new JLabel("Food Ordering System");
        l.setBounds(50, 50, 300, 20);
        l1 = new JLabel("result");
        l1.setBounds(100, 400, 300, 20);
        cb1 = new JCheckBox("Momo");
        cb1.setBounds(100, 100, 150, 20);
        cb1.addItemListener(this);
        cb2 = new JCheckBox("Pizza");
        cb2.setBounds(100, 150, 150, 20);
        cb2.addItemListener(this);
        cb3 = new JCheckBox("Chowmein");
        cb3.setBounds(100, 200, 150, 20);
        cb3.addItemListener(this);
        cb4 = new JCheckBox("Fry Rice");
        cb4.setBounds(100, 250, 150, 20);
        cb4.addItemListener(this);
        b = new JButton("Submit");

        b.setBounds(100, 300, 80, 30);
        add(l);
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
        add(b);
        add(l1);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        int count = 0;
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == cb1)
            l1.setText("You have Selected one item which is Momo ");
        if (e.getSource() == cb2)
            l1.setText("You have Selected one item which is Pizza ");
        if (e.getSource() == cb3)
            l1.setText("You have Selected one item which is Chowmein ");
        if (e.getSource() == cb4)
            l1.setText("You have Selected one item which is Fry Rice ");
        for(int i=1;i<=4;i++){
            
        }
    }

    public static void main(String[] args) {
        new lab5Qn5();
    }

}